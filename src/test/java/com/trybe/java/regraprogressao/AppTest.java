package com.trybe.java.regraprogressao;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  final static String EXPECTED_TEXT_TO_TYPE_ACTIVITY_QUANTITY = "Digite a quantidade de atividades para cadastrar:";
  final static String EXPECTED_TEXT_TO_TYPE_ACTIVITY_NAME = "Digite o nome da atividade";
  final static String EXPECTED_TEXT_TO_TYPE_ACTIVITY_WEIGHT = "Digite o peso da atividade";
  final static String EXPECTED_TEXT_TO_TYPE_ACTIVITY_GRADE = "Digite a nota obtida para";

  final static String RESULT_SUCCESS_PREFIX = "Parabéns! Você alcançou";
  final static String RESULT_SUCCESS_SUFFIX = "! E temos o prazer de informar que você obteve aprovação!";
  final static String RESULT_FAILURE_PREFIX = "Lamentamos informar que, com base na sua pontuação alcançada neste período,";
  final static String RESULT_FAILURE_SUFFIX = ", você não atingiu a pontuação mínima necessária para sua aprovação.";

  final static String[] activitiesNames = {"Exercício Alfa", "Projeto Beta",};
  final static int[] activitiesWeights = {40, 60};

  final static int activityQuantity = activitiesNames.length;

  final static PipedOutputStream pipedOutputStream = new PipedOutputStream();


  private static String normalizeString(String text) {
    final String matchSpacesAndSomePunctuationRegex = "[\\s,:!]";
    return text.replaceAll(matchSpacesAndSomePunctuationRegex, "").toUpperCase();
  }

  private static void waitForAppWriteOnStdout(ByteArrayOutputStream outStream)
      throws InterruptedException {
    int previousLength = outStream.size();
    int sleepTimeMs = 100;
    int sleepTimeout = 1000;
    while (outStream.size() == previousLength && sleepTimeout > 0) {
      Thread.sleep(sleepTimeMs);
      sleepTimeout -= sleepTimeMs;
    }
  }

  private static void inputTextToStdin(String text, ByteArrayOutputStream outStream)
      throws InterruptedException, IOException {
    byte[] bytes = text.getBytes();
    pipedOutputStream.write(bytes);
    pipedOutputStream.flush();
    waitForAppWriteOnStdout(outStream);
  }


  /**
   * testCadastrarAtividades
   */
  @Test
  @DisplayName("1 - Cadastra as atividades avaliativas com sucesso.")
  public void testCadastrarAtividades() throws Exception {
    InputStream sysInBackup = System.in;
    PrintStream sysOutBackup = System.out;
    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    final PipedInputStream pipedInputStream = new PipedInputStream();
    System.setOut(new PrintStream(outStream));
    pipedOutputStream.connect(pipedInputStream);
    System.setIn(pipedInputStream);

    try {
      Thread appThread = new Thread(() -> App.main(null));
      Thread testThread = new Thread(() -> {
        try {
          inputTextToStdin(activityQuantity + "\n", outStream);
          for (int i = 0; i < activityQuantity; i++) {
            String activityName = activitiesNames[i] + "\n";
            inputTextToStdin(activityName, outStream);

            String activityWeight = activitiesWeights[i] + "\n";
            inputTextToStdin(activityWeight, outStream);

            String actualOutput = outStream.toString();
            String cleanActualOutput = normalizeString(actualOutput);
            if (cleanActualOutput.contains(normalizeString(EXPECTED_TEXT_TO_TYPE_ACTIVITY_GRADE))) {
              inputTextToStdin("100\n", outStream);
            }
          }
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
      });
      appThread.start();
      testThread.start();
      testThread.join();
      String actualOutput = outStream.toString();
      String cleanActualOutput = normalizeString(actualOutput);

      assertTrue(cleanActualOutput.contains(normalizeString(EXPECTED_TEXT_TO_TYPE_ACTIVITY_QUANTITY)));
      for (int i = 1; i <= activityQuantity; i++) {
        String expectedOutput = EXPECTED_TEXT_TO_TYPE_ACTIVITY_NAME + i + EXPECTED_TEXT_TO_TYPE_ACTIVITY_WEIGHT
            + i;
        String cleanExpectedOutput = normalizeString(expectedOutput);
        assertTrue(cleanActualOutput.contains(cleanExpectedOutput));
      }
    } finally {
      System.setIn(sysInBackup);
      System.setOut(sysOutBackup);
    }
  }

  /**
   * testInsereNotas
   */
  @Test
  @DisplayName("2 - Insere as notas com sucesso.")
  public void testInsereNotas() {
    String input = """ 
        2
        Exercício Alfa
        40
        35
        Projeto Beta
        60
        55
        """;
    InputStream sysInBackup = System.in;
    PrintStream sysOutBackup = System.out;
    try {
      ByteArrayInputStream inStream = new ByteArrayInputStream(input.getBytes());
      ByteArrayOutputStream outStream = new ByteArrayOutputStream();

      System.setIn(inStream);
      System.setOut(new PrintStream(outStream));

      App.main(null);

      String actualOutput = outStream.toString();
      String cleanActualOutput = normalizeString(actualOutput);
      assertTrue(cleanActualOutput.contains(normalizeString(EXPECTED_TEXT_TO_TYPE_ACTIVITY_QUANTITY)));
      for (String projectName : activitiesNames) {
        String expectedOutput = EXPECTED_TEXT_TO_TYPE_ACTIVITY_GRADE + projectName;
        String cleanExpectedOutput = normalizeString(expectedOutput);
        assertTrue(cleanActualOutput.contains(cleanExpectedOutput));
      }
    } finally {
      System.setIn(sysInBackup);
      System.setOut(sysOutBackup);
    }
  }

  /**
   * testEmiteResultadoAprovado
   */
  @Test
  @DisplayName("3 - Emite o resultado correto quando há aprovação.")
  public void testEmiteResultadoAprovado() {
    String input = """ 
        2
        Exercício Alfa
        40
        70
        Projeto Beta
        60
        95
        """;
    InputStream sysInBackup = System.in;
    PrintStream sysOutBackup = System.out;
    try {
      ByteArrayInputStream inStream = new ByteArrayInputStream(input.getBytes());
      ByteArrayOutputStream outStream = new ByteArrayOutputStream();

      System.setIn(inStream);
      System.setOut(new PrintStream(outStream));

      App.main(null);

      String actualOutput = outStream.toString();
      String cleanActualOutput = normalizeString(actualOutput);
      String expectedOutput = RESULT_SUCCESS_PREFIX + "85.0%" + RESULT_SUCCESS_SUFFIX;
      String cleanExpectedOutput = normalizeString(expectedOutput);
      assertTrue(cleanActualOutput.contains(cleanExpectedOutput));
    } finally {
      System.setIn(sysInBackup);
      System.setOut(sysOutBackup);
    }
  }

  /**
   * testEmiteResultadoReprovado
   */
  @Test
  @DisplayName("4 - Emite o resultado correto quando há reprovação.")
  public void testEmiteResultadoReprovado() {
    String input = """ 
        2
        Exercício Alfa
        40
        35
        Projeto Beta
        60
        55
        """;

    InputStream sysInBackup = System.in;
    PrintStream sysOutBackup = System.out;

    try {
      ByteArrayInputStream inStream = new ByteArrayInputStream(input.getBytes());
      ByteArrayOutputStream outStream = new ByteArrayOutputStream();

      System.setIn(inStream);
      System.setOut(new PrintStream(outStream));

      App.main(null);

      String actualOutput = outStream.toString();
      String cleanActualOutput = normalizeString(actualOutput);
      String expectedOutput = RESULT_FAILURE_PREFIX + "47.0%" + RESULT_FAILURE_SUFFIX;
      String cleanExpectedOutput = normalizeString(expectedOutput);
      assertTrue(cleanActualOutput.contains(cleanExpectedOutput));
    } finally {
      System.setIn(sysInBackup);
      System.setOut(sysOutBackup);
    }
  }
}
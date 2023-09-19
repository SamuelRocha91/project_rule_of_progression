package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    App.coletarNotas();
  }

  /**
   * Coleta as informacoes do usuario.
   */
  public static void coletarNotas() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantia = scanner.nextInt();
    Integer[] arrayDePesos = new Integer[quantia];
    String[] arrayDeNomes = new String[quantia];
    Integer[] arrayDeNotas = new Integer[quantia];

    for (int index = 0; index < quantia; index++) {
      int posicao = index + 1;
      System.out.printf("Digite o nome da atividade " + posicao + ":\n");
      scanner.nextLine();
      String nome = scanner.nextLine();
      System.out.printf("Digite o peso da atividade " + posicao + ":\n");
      String input2 = scanner.next();
      System.out.printf("Digite a nota obtida para " + nome + ":\n");
      String input3 = scanner.next();
      arrayDeNotas[index] = Integer.parseInt(input3);
      arrayDePesos[index] = Integer.parseInt((input2));
    }
    scanner.close();
    double percentual = calcularPercentual(arrayDeNotas, arrayDePesos);
    if (percentual >= 85) {
      System.out.print("Parabéns! Você alcançou " + percentual
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.print(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + percentual
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }

  /**
   * Calcula nota final do usuario.
   */
  public static double calcularPercentual(Integer[] arrayNotas, Integer[] arrayPeso) {
    double sumPesos = 0;
    double pesoNota = 0;
    for (int i = 0; i < arrayNotas.length; i += 1) {
      sumPesos += arrayPeso[i];
      pesoNota += arrayNotas[i] * arrayPeso[i];
    }
    return pesoNota / sumPesos;
  }
}
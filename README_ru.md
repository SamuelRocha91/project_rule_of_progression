# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> Проект Правила Продвижения <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ar.md)

## Описание Проекта

Java является одним из самых популярных языков программирования, известным своей портативностью и надежностью. В проекте "Правила Продвижения" были отработаны основные знания о языке Java и его инструментах, включая:

- Осознанное использование примитивных и непримитивных типов.
- Обработка ввода и вывода данных.
- Структуры управления и условные операторы.
- Использование JDK и Maven (MVN).
- Разработка в IntelliJ IDEA.

В этом проекте была реализована класс `App`, расположенный в папке `src`, который содержит метод, отвечающий за сбор информации от пользователя, а также метод для обработки этих данных. Цель состоит в том, чтобы позволить пользователю вводить количество проведенных оценок, их названия, оценки и соответствующие веса, что позволит вынести решение об одобрении или отклонении.

<details>
  <summary><h2>Функциональные Возможности</h2></summary>

  - **Сбор Оценок**: Позволяет пользователю регистрировать оценки, указывая название, вес и оценку.
  - **Расчет Процента**: Оценивает средневзвешенное значение оценок и определяет статус студента (одобрение или отклонение) на основе минимального балла.
</details>

<details>
  <summary><h2>Пример Использования</h2></summary>
  Код ниже иллюстрирует, как собираются и обрабатываются данные:
  
  ```java
  public static void собиратьОценки() {
      // Логика для сбора и обработки оценок
  }
  ```
</details>

<details>
  <summary><h2>Используемые Технологии</h2></summary>

  - **Java**: Основной язык программирования.
  - **Spring Boot**: Для создания приложений и REST API.
  - **Maven**: Инструмент управления проектами Java.
  - **IntelliJ IDEA**: IDE, используемая для разработки.
</details>

<details>
  <summary><h2>Другие Проекты</h2></summary>

  - 🗳️ [Система Голосования](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ru.md)
  - 🏛️ [Локатор Музеев](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md)
</details>

<details>
  <summary><h2>Как Запустить</h2></summary>
  
  1. **Клонируйте этот репозиторий** на свой локальный компьютер:
     ```sh
     git clone https://github.com/SamuelRocha91/project_rule_of_progression.git
     ```

  2. **Перейдите в директорию проекта**.

  3. **Скомпилируйте и запустите приложение** с помощью Maven:
     ```sh
     mvn spring-boot:run
     ```
</details>
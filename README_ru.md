# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> Проект Правила Прогрессии <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/project_rule_of_progression/project_rule_of_progression/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ar.md)

## Описание Проекта

Java является одним из самых популярных языков программирования, известным своей портативностью и надежностью. В проекте "Правила Прогрессии" были отработаны основные знания о языке Java и его инструментах, включая:

- Осознанное использование примитивных и непримитивных типов.
- Обработка ввода и вывода данных.
- Использование циклов и условных операторов.
- Работа с JDK и Maven (MVN).
- Разработка в IntelliJ IDEA.

В этом проекте была реализована класс `App`, расположенный в папке `src`, который содержит метод для сбора информации от пользователя, а также метод для обработки этих данных. Цель заключается в том, чтобы позволить пользователю вводить количество проведенных оценок, их названия, оценки и соответствующие веса, что позволяет выдавать вердикт о прохождении или непрохождении.

### Функциональности

- **Сбор Оценок**: Позволяет пользователю регистрировать оценки, указывая названия, веса и оценки.
- **Расчет Процента**: Оценивает среднее взвешенное оценок и определяет статус студента (принятие или отклонение) на основе минимальной необходимой оценки.

### Пример Использования

Следующий код иллюстрирует, как собираются и обрабатываются данные:

```java
public static void coletarNotas() {
    // Логика для сбора и обработки оценок
}
```

## Используемые Технологии

- **Java**: Основной язык программирования.
- **Spring Boot**: Для создания приложений и REST API.
- **Maven**: Инструмент управления проектами для Java.
- **IntelliJ IDEA**: IDE, используемая для разработки.

## Другие Проекты

- 🗳️ [Система Голосования](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ru.md)
- 🏛️ [Поиск Музеев](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md)

## Как Запустить

1. **Клонируйте этот репозиторий** на вашу локальную машину:
   ```sh
   git clone https://github.com/SamuelRocha91/project_rule_of_progression.git
   ```

2. **Перейдите в директорию проекта**.

3. **Соберите и запустите приложение** с помощью Maven:
   ```sh
   mvn spring-boot:run
   ```

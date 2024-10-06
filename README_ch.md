# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> 进阶规则项目 <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ar.md)

## 项目描述

Java 是最受欢迎的编程语言之一，以其可移植性和健壮性而闻名。在“进阶规则”项目中，锻炼了对 Java 语言及其工具的基本知识，包括：

- 有意识地使用原始类型和非原始类型。
- 数据输入和输出的处理。
- 循环结构和条件语句。
- 使用 JDK 和 Maven (MVN)。
- 在 IntelliJ IDEA 中开发。

在此项目中，实施了位于 `src` 文件夹中的 `App` 类，其中包含一个用于收集用户信息的方法，以及一个用于处理这些数据的方法。其目的是允许用户输入所进行的评估数量、其名称、分数和相应的权重，从而能够做出通过或不通过的判断。

<details>
  <summary><h2>功能</h2></summary>
  - **分数收集**：允许用户注册评估，输入名称、权重和分数。
  - **百分比计算**：评估分数的加权平均值，并根据最低分数确定学生的状态（通过或不通过）。
</details>

<details>
  <summary><h2>使用示例</h2></summary>
  以下代码示例说明了信息如何被收集和处理：
  
  ```java
  public static void 收集分数() {
      // 收集和处理分数的逻辑
  }
  ```
</details>

<details>
  <summary><h2>使用技术</h2></summary>
  - **Java**：主要编程语言。
  - **Spring Boot**：用于构建应用程序和 REST API。
  - **Maven**：Java 项目管理工具。
  - **IntelliJ IDEA**：用于开发的 IDE。
</details>

<details>
  <summary><h2>其他项目</h2></summary>
  - 🗳️ [投票系统](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ch.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ch.md)
  - 🏛️ [博物馆定位器](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ch.md)
</details>

<details>
  <summary><h2>如何运行</h2></summary>
  1. **克隆此仓库**到您的本地计算机：
     ```sh
     git clone https://github.com/SamuelRocha91/project_rule_of_progression.git
     ```

  2. **导航到项目目录**。

  3. **使用 Maven 编译并运行应用程序**：
     ```sh
     mvn spring-boot:run
     ```
</details>
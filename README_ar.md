# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> مشروع قواعد التقدم <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ar.md)

## وصف المشروع

تعتبر Java واحدة من أشهر لغات البرمجة، وتشتهر بقابليتها للنقل وموثوقيتها. في مشروع "قواعد التقدم"، تم ممارسة المعرفة الأساسية حول لغة Java وأدواتها، بما في ذلك:

- الاستخدام الواعي للأنواع البدائية وغير البدائية.
- معالجة المدخلات والمخرجات.
- هياكل التحكم والشرطية.
- استخدام JDK و Maven (MVN).
- التطوير في IntelliJ IDEA.

في هذا المشروع، تم تنفيذ فئة `App`، الموجودة في مجلد `src`، التي تحتوي على طريقة مسؤولة عن جمع معلومات المستخدم، بالإضافة إلى طريقة لمعالجة هذه البيانات. الهدف هو تمكين المستخدم من إدخال عدد التقييمات المنجزة، وأسمائها، ودرجاتها، وأوزانها، مما يتيح إصدار حكم بالنجاح أو الرسوب.

<details>
  <summary><h2>الميزات</h2></summary>
  - **جمع الدرجات**: يسمح للمستخدم بتسجيل التقييمات، مع إدخال الاسم والوزن والدرجة.
  - **حساب النسبة المئوية**: يقيم المتوسط المرجح للدرجات ويحدد حالة الطالب (نجاح أو رسوب) بناءً على الحد الأدنى من الدرجات.
</details>

<details>
  <summary><h2>مثال على الاستخدام</h2></summary>
  يوضح الكود أدناه كيفية جمع المعلومات ومعالجتها:
  
  ```java
  public static void جمع_الدرجات() {
      // منطق جمع ومعالجة الدرجات
  }
  ```
</details>

<details>
  <summary><h2>التقنيات المستخدمة</h2></summary>
  - **Java**: لغة البرمجة الرئيسية.
  - **Spring Boot**: لبناء التطبيقات وواجهات برمجة التطبيقات REST.
  - **Maven**: أداة إدارة مشاريع Java.
  - **IntelliJ IDEA**: بيئة التطوير المتكاملة المستخدمة للتطوير.
</details>

<details>
  <summary><h2>مشاريع أخرى</h2></summary>
  - 🗳️ [نظام التصويت](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ar.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ar.md)
  - 🏛️ [محدد المتاحف](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ar.md)
</details>

<details>
  <summary><h2>كيفية التنفيذ</h2></summary>
  1. **استنساخ هذا المستودع** إلى جهاز الكمبيوتر الخاص بك:
     ```sh
     git clone https://github.com/SamuelRocha91/project_rule_of_progression.git
     ```

  2. **انتقل إلى دليل المشروع**.

  3. **قم بتجميع وتشغيل التطبيق** باستخدام Maven:
     ```sh
     mvn spring-boot:run
     ```
</details>
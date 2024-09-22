
# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> مشروع قواعد التقدم <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/project_rule_of_progression/project_rule_of_progression/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ar.md)

## وصف المشروع

Java هي واحدة من أكثر لغات البرمجة شيوعًا، حيث تتميز بقابليتها للنقل وقوتها. في مشروع "قواعد التقدم"، تم ممارسة المعرفة الأساسية حول لغة Java وأدواتها، بما في ذلك:

- الاستخدام الواعي للأنواع الأولية وغير الأولية.
- معالجة إدخال وإخراج البيانات.
- هياكل التكرار والشروط.
- استخدام JDK و Maven (MVN).
- تطوير باستخدام IntelliJ IDEA.

في هذا المشروع، تم تنفيذ فئة `App`، الموجودة في مجلد `src`، التي تحتوي على طريقة لجمع معلومات المستخدم، بالإضافة إلى طريقة لمعالجة هذه البيانات. الهدف هو السماح للمستخدم بإدخال عدد التقييمات التي تم إجراؤها، وأسمائها، ودرجاتها، وأوزانها المقابلة، مما يتيح إصدار حكم بالنجاح أو الرسوب.

### الميزات

- **جمع الدرجات**: يسمح للمستخدم بتسجيل التقييمات، وإدخال الاسم، والوزن، والدرجة.
- **حساب النسبة المئوية**: يقيم المتوسط المرجح للدرجات ويحدد حالة الطالب (نجاح أو رسوب) بناءً على النقطة الحد الأدنى.

### مثال على الاستخدام

يوضح الكود أدناه كيفية جمع المعلومات ومعالجتها:

```java
public static void coletarNotas() {
    // المنطق لجمع ومعالجة الدرجات
}
```

## التقنيات المستخدمة

- **Java**: لغة البرمجة الرئيسية.
- **Spring Boot**: لبناء التطبيقات وواجهات برمجة التطبيقات REST.
- **Maven**: أداة إدارة المشاريع لـ Java.
- **IntelliJ IDEA**: بيئة تطوير متكاملة تُستخدم للتطوير.

## مشاريع أخرى

- 🗳️ [نظام التصويت](https://github.com/SamuelRocha91/sistemaDeVotacao)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix)
- 🏛️ [محدد المتاحف](https://github.com/SamuelRocha91/localizadorDeMuseus)

## كيفية التشغيل

1. **استنساخ هذا المستودع** إلى جهاز الكمبيوتر المحلي الخاص بك:
   ```sh
   git clone https://github.com/SamuelRocha91/project_rule_of_progression.git
   ```

2. **انتقل إلى مجلد المشروع**.

3. **قم بتجميع وتشغيل التطبيق باستخدام Maven**:
   ```sh
   mvn spring-boot:run
   ```

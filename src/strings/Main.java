package strings;

public class Main {
    public static void main(String[] args) {

        //      WorkWithStrings.Strings
//      Рядки використовуються для зберігання тексту
        String greeting = "hello";

//      Конкатенація рядків. Для +їх об’єднання між рядками можна використовувати оператор

        String name = "Bob";
        String space = " ";
        String surname = "Meyson";
        System.out.println(name + space + surname); // Bob Meyson

//      String заражає собою увесь вираз

        System.out.println("!" + 10 + 20); // !1020
        System.out.println(10 + 20 + "!");  // 30!

//      Спеціальні символи
//      Іноді нам необхідно в стрінгу добавити одинарні або подвійні лапки. Знак \ допомагає нам перетворити спеціальні
//      символи на символи рядка

//      Одинарні лапки - \'                 -> '
//      Подвійні лапки - \"                 -> "
//      Бекслеш - \\                        -> \
//      Таб  - \t
//      Новий рядок - \n

        String txt = "We call him \"Meyson\" "; // We call him "Meyson"
        String txt2 = "I\'m okay)";   // I'm okay)
        String txt3 = "Цей знак \\ називається бекслеш"; // Цей знак \ називається бекслеш
        String txt4 = "Бекслеш виглядає\tось так"; // Бекслеш виглядає	ось так
        String txt5 = "З нового рядка \n це буде";

//      Рядок у Java насправді є об’єктом, який містить методи, які можуть виконувати певні операції над рядками.
//      Ось ряд певних методів

//      Довжина рядка. Включає у себе і пробіли
        System.out.println("Bla bla bla".length()); // 11

//      Перетворити малі літери у великі і великі у малі
        System.out.println("HELLO WORLD".toLowerCase()); // hello world
        System.out.println("hello world".toUpperCase()); // HELLO WORLD

//      Знайти індекс символа стрінги включаючи пробіли. Якщо є декілька таких, то вертається індекс першого елемента.
        System.out.println("Hello world".indexOf("o")); // 4

//      Забирає пробіли із початку і з кінця
        System.out.println("   Hello world  ".trim());

//      Вернути певний елемент, за вказаним індексом
        System.out.println("Breakfast".charAt(5)); // f

//      Вернути юнікод символу за вказаним символом
        System.out.println("Breakfast".codePointAt(5)); // юнікод f буде 102

//      Вернути юнікод символу перед вказаним індексом
        System.out.println("Breakfast".codePointBefore(6)); // так само 102 тому що перед 6 індексом йде f

//      Повернути кількість значень Unicode, знайдених у рядку.
        System.out.println("Breakfast".codePointCount(1, 4)); // 3

//      Порівняння рядків. Метод вертає 0, якщо рядок дорівнює іншому рядку
//      Повертає значення менше нуля, якщо рядок менше іншого рядка
//      Повертає значення більше нуля, якщо рядок більше іншого рядка
        String str = "Hello11111";
        String str_two = "Hello";
        System.out.println(str.compareTo(str_two)); // 5 поверне тому що перший рядок більше на 5 символів

//      Також порівнює два рядки і повертає true, якщо рядки рівні, і false, якщо ні. Вертає булівсьий тип
        System.out.println(str.equals(str_two));

//      2 основні відмінності між compareTo equals
//      a) equals буде приймати будь-який об’єкт як параметр, але compareTo прийматиме лише рядки.
//      b) equals говорить лише про те, що вони рівні чи ні, але compareTo надає інформацію про те, як рядки
//      порівнюються лексикографічно.

//      Конкатитувати 2 рядка: з'єднати
        System.out.println(str.concat(str_two)); // Hello11111Hello

//      Перевірити чи рядок містить послідовність символів. Вертає булівський тип
        System.out.println(str_two.contains("llo")); // true

//      Перевірити чи містить рядок певну послідовність символів у вказаному рядку. Вертає булівський тип
        System.out.println(str_two.contentEquals("o")); // false
        System.out.println(str_two.contentEquals("llo")); // false
        System.out.println(str_two.contentEquals("Hello")); // true

//      Перевіряє, чи закінчується рядок вказаними символами. Вертає булівський тип
        String newString = "This is string";
        System.out.println(newString.endsWith("ing")); // True

//      Так само можна перевірити чи починається рядок з вказаними елементами. Вертає булівський тип
        System.out.println(newString.startsWith("Th")); // True

//      Перевірити чи пуста стрічка. Вертає булівський тип.
        String emptyString = "";
        System.out.println(emptyString.isEmpty()); // true. Якщо додати пробіл буде false. Пробіл це також символ

//      Отримати hashCode рядка
        String hashString = "Hash String";
        System.out.println(hashString.hashCode()); // 1868558179

//      Знайти в рядку вказаний символ і повертає новий рядок, де вказаний символ(и) замінено.
//      Перший елемент ми вказуємо, що хочемо замінити, а другий елемент на що саме замінити
        String replaceString = "Replace String";
        System.out.println(replaceString.replace('l','p')); // Reppace String

    }
}

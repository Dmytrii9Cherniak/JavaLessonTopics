package Operators;

public class Main {
    public static void main(String[] args) {

//  Java ділить оператори на такі групи
//    - Арифметичні оператори
//    - Оператори присвоєння
//    - Оператори порівняння
//    - Логічні оператори
//    - Побітові оператори

//   Арифметичні оператори
//   Арифметичні оператори використовуються для виконання звичайних математичних операцій.

//   Всі арифметичні оператори:
//   +  -   *   /   %   ++  --

        int a = 5;
        int b = 6;

//        Додавання
        System.out.println(a + b); // 11

//        Віднімання
        System.out.println(b - a); // 1

//        Множення
        System.out.println(a * b); // 30

//        Ділення
        System.out.println(b / a); // 1

//        Модуль
        System.out.println(b % a); // 1 Тому що в шістку, 5-тірка входить лиш один раз. Вертає остачу від ділення

//        Інкремент: Збільшує значення змінної на 1
        System.out.println(++a); // 6

//        Декремент: Зменшує значення змінної на 1
        System.out.println(--b); // 5



//        Оператори присвоєння
//        Оператори присвоєння використовуються для присвоєння значень змінним.
        int x = 11;

//        Оператор присвоєння додавання ( +=) додає значення до змінної:
        int xNew = 15;
        System.out.println(xNew += 4); // 19

//        Список операторів присвоєння:
//        =   +=  -=  *=  /=  %=  &=  |=  ^=  >>= <<=

        int operator;

//        Оператор    Приклад             Таке само як
//        =           operator = 17      operator = 17
//        +=          operator += 3      operator = operator + 3
//        -=          operator -= 3      operator = operator - 3
//        *=          operator *= 3      operator = operator * 3;
//        /=          operator /= 3      operator = operator / 3;
//        %=          operator %= 3      operator = operator % 3;
//        &=          operator &= 3      operator = operator & 3;



//        Оператори порівняння
//        Оператори порівняння використовуються для порівняння двох значень:
//        Список операторів порівняння:
//        ==    !=  >   <   >=  <=

        int comparison = 5;

//      Рівне до:
        System.out.println(comparison == 5); // true, тому що умова сходиться

//      Не рівне до
        System.out.println(comparison != 5); // false, тому що умова не сходиться

//      Більше ніж і менше ніж
        System.out.println(comparison > 5); // false, тому що вони рівні
        System.out.println(comparison < 5); // false, тому що вони рівні

//      Більше або дорівнює і менше або дорівнює
        System.out.println(comparison >= 5);
        System.out.println(comparison <= 5);




//      Логічні оператори Java
//      Логічні оператори використовуються для визначення логіки між змінними або значеннями
//      &&  ||  !

        int logical_operator = 35;

//      Логічне i
//      Вертає булівський тип, якщо обидві умови є правдиві
        System.out.println((logical_operator < 5 && logical_operator > 19)); // false
        System.out.println((logical_operator < 55 && logical_operator > 31)); // true

//      Логічне або
//      Вертає булівський тип, якщо одна із умов є правдива
        System.out.println((logical_operator < 5 || logical_operator > 33)); // true
        System.out.println((logical_operator < 5 || logical_operator > 39)); // false

//      Логічне ні
//      Вертає false, якщо умова є правдива

        System.out.println(!(logical_operator > 23 && logical_operator < 55)); // false

        int bit = 351;
        System.out.println(~bit);

    }
}
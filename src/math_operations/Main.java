package math_operations;

//  Клас Java Math має багато методів, які дозволяють виконувати математичні завдання над числами.
//  Всі методи імпортуються із класу Math

import java.lang.Math;
public class Main {
    public static void main(String[] args) {

//      Получити рандомне число. Метод random повертає випадкове число від 0,0 до 1,0 включно
        double first_random = Math.random();
        System.out.println(first_random);

//      Щоб отримати більший контроль над випадковим числом, наприклад, вам потрібно лише випадкове число від 0 до
//      100, ви можете використовувати таку формулу:
        int second_random = (int) (Math.random() * 101); //  Від 0 до 100
        System.out.println(second_random);
//      або
        double random = Math.random() * 100D;

//      Найти мінімальне і максимальне число
        int min_number = Math.min(35, 45);
        System.out.println(min_number); // 35
        int max_number = Math.max(35, 45);
        System.out.println(max_number); // 45

//      Закруглити число. Метод round() округлює float або double до найближчого цілого
//      числа, використовуючи звичайні математичні правила раунду (вгору або вниз).
        double round = Math.round(9.4252524234);
        System.out.println(round); // 9.0
        double round1 = Math.round(10.623402304);
        System.out.println(round1); // 10

//      Також є ще 2 методи щоб округлити число, а саме: ceil() і floor()
//      Округлене значення цих методів повертається як double
        double ceil = Math.ceil(7.343);
        double floor = Math.floor(7.343);
//      Різниця між ними в тому, що округлюють числа вони по-різному. floor округляє найближче ціле
//      число до зменшення, а ceil округляє число до збільшення
        System.out.println(floor); // 7.0
        System.out.println(ceil); // 8.0

//      Обчислити квадратний корінь
        double sqrt = Math.sqrt(5);
        System.out.println(sqrt); // 2.23606797749979

//      Піднести число в степінь. Перше число - що ми будемо підносити, друге - в яку степінь
        double powDigit = Math.pow(2,3);
        System.out.println(powDigit);

//      Знайти модуль числа
        double abs = Math.abs(-9.73);
        System.out.println(abs); // 9.73

//      Натуральний логарифм числа
        double logarifm = Math.log(55);
        System.out.println(logarifm); // 4.007333185232471

//      Десятковий логарифм певного числа
        double log10 = Math.log10(55);
        System.out.println("Log 10" + log10);

//      Також в Java є тригонометричні функції

        //      Получити число PI
        double numberPi = Math.PI;
        System.out.println(numberPi); // 3.141592653589793

//      Обчислити синус, косинус, тангенс, арксинус, дугового косинуса (арккосинуса), арктангенса
        double sinus = Math.sin(5);
        double cosinus = Math.cos(5);
        double tangens = Math.tan(5);
        double ark_sinus = Math.asin(5);
        double ark_cosinus = Math.acos(5);
        double ark_tangens = Math.atan(5);

//      Перетворити кут в радіанах у градуси
        double degrees = Math.toDegrees(Math.PI);

//      Перетворити кут в градусах в радіани
        double radians = Math.toRadians(180);

    }
}
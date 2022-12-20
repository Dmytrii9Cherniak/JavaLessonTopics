package type_casting;

public class Main {
    public static void main(String[] args) {

//        Приведення типу — це коли ви призначаєте значення одного примітивного типу даних іншому типу.
//        У Java існує два типи приведення типів:

//        Розширення типу - перетворення меншого типу даних в тип даних більшого розміру (автоматично)
//        byte -> short -> char -> int -> long -> float -> double

//        Звуження лиття - перетворення великого типу даних на тип даних меншого розміру
//        double -> float -> long -> int -> char -> short -> byte

//        Розширення лиття виконується автоматично при передачі типу меншого розміру до типу більшого розміру:

        int myInt = 9;
        double myDouble = myInt; // Автоматичне приведення

        System.out.println(myInt); // 9
        System.out.println(myDouble); // 9.0

//        Звуження переведення необхідно виконати вручну, помістивши тип у дужках перед значенням:

        double doubleNew = 9.78d;
        int intNew = (int) doubleNew;

        System.out.println(doubleNew); // 9.78
        System.out.println(intNew); // 9

    }
}
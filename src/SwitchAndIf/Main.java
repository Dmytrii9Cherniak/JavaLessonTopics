package SwitchAndIf;

public class Main {
    public static void main(String[] args) {

        //      Ми використовуємо оператор if щоб указати блок коду Java, який буде виконано, якщо умова є true
//      і використовуємо оператор else щоб указати блок коду, який буде виконано, якщо умова є false.

        int x = 25;
        int y = 19;
        if (x > y) {
            System.out.println("X greater Y");
        } else if (x < y) {
            System.out.println("X smaller Y");
        }

//      Ще приклад
        if (1 < 2) {
            System.out.println("1 smaller 2");
        } else {
            System.out.println("1 bigger 2");
        }

//      Також є коротка форма if/else. Називається тернарним оператором.
//      Ми записуємо умову (20 < 18), перевіряємо (?), записуємо резульат для істинної умови ("Good day"),
//      а якщо умова неправдива записуємо ("Good evening")
        String result = (20 < 18) ? "Good day" : "Good evening";
        System.out.println(result); // Good evening


//      Switch оператор ми використовуємо Використовуйте switch оператор,
//      щоб вибрати один із багатьох блоків коду для виконання.
//      Як працює оператор switch:
//            Вираз switch обчислюється один раз
//            Значення виразу порівнюється зі значеннями кожного case
//            day - наша умова. Switch пробігає по-кожному case і перевіряє. Default - значення по-замовчуваню,
//            якщо нічого не спрацює. Break ставимо для повного закінчення роботи кожного випадка

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}
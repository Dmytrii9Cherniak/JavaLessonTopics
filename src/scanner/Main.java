package scanner;

// Клас, із якого імпортується Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Клас Scanner пакета java.util використовується для зчитування вхідних даних з різних джерел,
//      таких як вхідні потоки, користувачі, файли тощо. Давайте розглянемо приклад.

//      Ми створюємо 3 об`єкти, які назвемо ім`я, прізвище і вік.
//      Параметр System.in використовується для отримання вхідних даних зі стандартного введення.Це працює так само,
//      як і введення з клавіатури.

//      Потім ми використовуємо метод nextLine() класу Scanner, щоб прочитати рядок тексту від користувача.

//      Клас Scanner надає різні методи, які дозволяють нам зчитувати вхідні дані різних типів:
//      nextInt, nextFloat, nextBoolean, nextLine, next, nextByte, nextDouble, nextShort, nextLong, nextBigInteger,
//      next читає слово користувача

        Scanner input_name = new Scanner(System.in);
        Scanner input_surname = new Scanner(System.in);
        Scanner input_age = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = input_name.nextLine();

        System.out.print("Type your surname: ");
        String surname = input_surname.nextLine();

        System.out.print("Type your age: ");
        String age = input_age.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);

//      Також нам потрібно закривати ці сканери, тому для цього ми використовуємо метод close.
//      Метод close() закриває відкритий сканер. Якщо сканер вже закритий, виклик цього методу не матиме жодного ефекту.
//      Як і будь-який об'єкт, що працює з потоками введення-виводу, сканер повинен бути закритий після завершення
//      своєї роботи, щоб не споживати ресурси нашого комп'ютера. Не треба забувати про метод close.

        input_name.close();
        input_surname.close();
        input_age.close();

//      Ми можемо використовувати Scanner також в умовних операторах.
//      Приклад з if

        System.out.print("Type your age: ");
        int age_user = new Scanner(System.in).nextInt();

        if (age_user <= 17) {
            System.out.println("You are too young");
        } else {
            System.out.println("You can go to this site");
        }

//      Приклад з switch

        System.out.print("Enter a season: ");
        Scanner season_in = new Scanner(System.in);
        String season = season_in.next();


        switch (season) {
            case "Autumn": {
                System.out.println("Today is autumn");
                break;
            }
            case "Winter": {
                System.out.println("Today is winter");
                break;
            }

            case "Spring": {
                System.out.println("Today is spring");
                break;
            }
            case "Summer": {
                System.out.println("Today is summer");
                break;
            }
            default: {
                System.out.println("Wrong season");
            }
        }

    }
}

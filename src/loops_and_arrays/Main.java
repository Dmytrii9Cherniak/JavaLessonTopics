package loops_and_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//      Цикли в Java діляться на 4 види

//      Цикли з передумовою - умова виконання визначається перед першою ітерацією.
//      Цикли з постумовою - умова виконання визначається після першої ітерації
//      Цикли з лічильником: кількість ітерацій визначається змодельованим лічильником.
//      Безумовні цикли - цикли, що виконуються нескінченно. Наприклад: "Поки 1 = 1, друкувати "1 = 1"".
//      Така програма виконуватиметься, доки її вручну не перервуть.

//      В Java є декілька циклів: for, foreach, while, do while


//      Стандартний цикл for

//      i - довільна назва змінної
//      i = 0; - початкова умова, з чого починається цикл
//      i < 5 - умова виконання циклу. Поки умова істинна, цикл виконується
//      i++ - виконується щоразу після виконання блоку (може йти і у зворотньому напрямку: і--)
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello"); // 5 разів покаже
        }

//      Ми можемо збільшити наш крок. Для прикладу
        for (int w = 0; w < 9; w = w + 2) {
            System.out.println(w); // 2 4 6 8
        }


//      Цикл while проходить через блок коду до тих пір, поки задана умова true
        int i = 0;
        while (i < 9) {
            System.out.println(i); // Виведеться від 0 до 8
            i++;
        }

//      Do while похожий на простий while. Він говорить: роби щось, поки умова вірна
        int b = 0;
        do {
            System.out.println("Hello world"); // 3 рази виведеться фраза Hello world
            b++;
        } while (b < 3);

//      Break i Continue в циклах:

//      Оператор break можна використовувати для виходу із циклу (повного переривання)
        for (int loopBreak = 0; loopBreak < 11; loopBreak++){
            if (loopBreak == 6){
                break;
            }
            System.out.println(loopBreak); // 0 1 2 3 4 5
        }

//      Оператор continue перериває одну ітерацію (у циклі), якщо виникає зазначена умова
//      і продовжує наступну ітерацію в циклі.
        for (int continueLoop = 0; continueLoop < 5; continueLoop++) {
            if (continueLoop == 4) {
                continue;
            }
            System.out.println(i); // 0 1 2 3 5
        }

//      Break i Continue и можемо використовувати і у while циклах
        int whileBreak = 0;
        while (whileBreak < 5) {
            System.out.println(whileBreak); // 0, 1, 2
            whileBreak++;
            if (whileBreak == 3) {
                break;
            }
        }

        int whileContinue = 0;
        while (whileContinue < 7) {
            if (whileContinue == 4) {
                whileContinue++;
                continue;
            }
            System.out.println(whileContinue); // 0 1 2 3 5 6
            whileContinue++;
        }


//      Масиви в Java. Оголосити масив дуже просто. Ми вказуємо тип даних, який масив буде вміщати і ставимо кв. дужки
        String[] skills;

//      Можемо зразу його наповнити
        String[] skills2 = {"One", "Two", "Three"};

//      Наший масив може бути із певною кількістю елементів
        String[] skills3 = new String[3];
        skills3[1] = "Hello";
        skills3[2] = "Hi";

//      В масивів є також певні методи
//      Дізнатись довжину масиву

        int[] methods = {5, 9, 14, 19, 1, 6, 3};
        System.out.println(methods.length); // 7

//      Сортування масиву. ToString метод допоможе нам привести/показати масив у потрібному нам вигляді
        Arrays.sort(methods);
        System.out.println(Arrays.toString(methods));

//      Перевірити чи збігаються масиви
        int[] equal1 = {1, 9, 11};
        int[] equal2 = {1, 9, 11};
        System.out.println(Arrays.equals(equal1, equal2)); // True

//      Отже, ми з масивами розібралися, а тепер як працює цикл foreach
//      Цикл foreach застосовується суто для масивів

        String[] days_of_week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

//      Ми вказуємо тип даних (String), вказуємо змінну в яку запишемо кожен елемент (day)
//      і пишемо змінну - назву існуючого масиву (day_of_week)

        for (String day : days_of_week) {
            System.out.println(day);
        }


//      Багатовимірні масиви
//      Багатовимірний масив —це масив масивів.Щоб створити двовимірний масив, додайте кожен масив у власний
//      набір фігурних дужок:

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

//      myNumbers тепер є масивом із двома масивами як елементами. Щоб отримати доступ до елементів масиву
//      myNumbers, вкажіть два індекси:один для масиву, а другий для елемента всередині цього масиву.
//      Цей приклад отримує доступ до третього елемента(2) у другому масиві(1) myNumbers:

        int x = myNumbers[1][2];
        System.out.println(x); // 7

//      Ми також можемо використовувати for loopвсередині іншого for loop, щоб отримати елементи
//      двовимірного масиву (нам все одно потрібно вказати на два індекси):

        for (int z = 0; z < myNumbers.length; ++z) {
            for (int j = 0; j < myNumbers[z].length; ++j) {
                System.out.print(myNumbers[z][j]);
            }
        }

//      Ще приклад: найпростіший і найпоширеніший приклад двухвимірного масива - це матриця.
//            1   2
//            3   4
//      Число 1 це перетин 0 рядка і 0 стовбчика
//      Число 2 це перетин 0 рядка і 1 стовбчика
//      Число 3 це перетин 1 рядка і 0 стовбчика
//      Число 4 це перетин 1 рядка і 1 стовбчика

//      int[][] matrix = new int[2][2];

//      або
        int[][] matrix = {{1,2},{3,4}};

//      При ініціалізації двовимірного масиву можна помітити відмінність від звичайного масиву.
//      У двомірному масиві Ви використовуєте дві квадратні дужки замість однієї. У першій ми пишемо кількість рядків
//      а у другій ви пишіть кількість стовпців

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[line].length; ++column) {
                System.out.print(matrix[line][column] + "\t");
            }
            System.out.println();
        }   // 1 2
        // 3 4

//      ++i i++ Різниця:
//      Вони є одинакові і обидва збільшують число, але ++i збільшує число до оцінки поточного виразу, тоді
//      як i++ збільшує число після обчислення виразу

    }
}
package OOP_2;

public class Main {
    public static void main(String[] args) {

//  Коли ми звертаємося до нашого enum, через крапочку, ми зразу бачимо всі значення. Вона зразу пристутні у системі, тому що
//  вони є static і одразу завантажуються в RAM. Також ми можемо побачити метод values() - ми отримаємо масив всіх значень
//  і ми не можемо змінити цей масив.

//  Також, за допомогою метода valueOf(), ми можемо отримати по-назві об'єкт.
//  В даному випадку, ми зробили посилання на цей об'єкт, існуючий об'єкт, існуючу комірку.
//  Якщо ми введемо значення, якого не існує, ми отримаємо IllegalArgumentException

//        final CarType sedan = CarType.valueOf("SEDAN");
//        System.out.println(sedan); // SEDAN
//
//        final CarType[] values = CarType.values();
//        for (CarType value: values) {
////  Давайте змінимо якесь значення
//            if (value.getUkrainianTranslation().equals("Седан")) {
//                value.setUkrainianTranslation("Ліфтбек");
//            }
//            System.out.println(value.drawAllCars());
//            System.out.println(value.draw());
//            System.out.println(value);
//        }


//  Створємо об'єкт двигуна і посилання на цей об'єкт передаємо у новостворений об'єкт машини.

        Engine engine = new Engine(1.5, 155);
        Car car = new Car("Opel", 5600, engine, CarType.SEDAN);
        System.out.println(car);

//  Ці об'єкти дуже сильно між собою зв'язані. Якщо, для прикладу, ми захочемо умодифікувати наш двигун, то це вплине
//  на двигун нашої машини. Відповідно, двигун нашої машини зміниться.

//  Java діє по pass-by-reference принципу. Тобто, ми передали не просто будь який об'єкт engine. Ми передали конкретне
//  посилання об'єкта engine.

        engine.setPower(engine.getPower() * 3);
        System.out.println(car);

//  У нас виникає питання, ци нас це все влаштовує? Мати окремий об'єкт, окрему ссилку на об'єкт двигуна, окремо і всередині машини.
//  Зараз ми не застраховані від того, щоб не створити окрему машину, але із тим же самими двигуном. Це означає, що
//  на об'єкт двигуна, у нас діє 3 ссилки: пряма ссилка (коли ми створємо об'єкт двигуна) і 2 сслики на кожній машині.

        Car car1 = new Car("Kia", 9100, engine, CarType.HATCHBACK);

//  Це нам зовсім не підходить. В такому випадку, напряму в свої конструктори, передаємо об'єкт. Тепер цей двигун
//  належить конкретно саме цій машині.

        Car car2 = new Car("BMW", 21000, new Engine(1.9, 250), CarType.HATCHBACK);

//  Java є дуже типово-залежна, вона дуже залежна від типів. Якщо вхідний параметр метода є певним типом, то воно хоче
//  саме цей тип, але її абсолютно не цікавить, звідки ці типи візмуться.
//  Для прикладу, це не буде помилкою, якщо одне з полів, у нашому випадку price, буде так записане. Це не важливо,
//  тому що в кінцевому випадку, тут буде int. Скільки буде операцій, щоб зробити int, йому не важливо. Ми можемо викликати
//  метод, всередині інших методів і т.д

        Car car3 = new Car("BMW", 15900 * 51 - 51, engine, CarType.SUV);

//  Або ми можемо написати: викликати двигун із іншої машини

        Car car4 = new Car("Audi", 55000, car3.getEngine(), CarType.HATCHBACK);

//  В класі Engine ми створили метод startEngine(). Клас Car не має доступу до методів класу Engine. Але клас Car
//  має у собі об'єкт engine. Маючи об'єкт всередині себе об'єкт класу, ми маємо можливість викликати методи цього класу.

//  Ми отримуємо доступ до методів класу Engine і ми можемо його викликати. З машини ми маємо доступ до двигуна, а з двигуна
//  маємо доступ до його методів.

        car4.getEngine().startEngine();

//  Але правильніше запускати нашу машину з машиини, не із двигуна. Зараз ми запустимо машину напряму

        car.startCar();

//  Найкраща практика це викликати метод із свого об'єкта, який містить у собі вже інші об'єкти.

//  Тобто, це є композиція - концепція, що передбачає зв'язок has a між двома сутностями. Одна сутність має іншу сутність.
//  Цей зв'язок може бути, як односторонній, так і двосторонній.

    }
}

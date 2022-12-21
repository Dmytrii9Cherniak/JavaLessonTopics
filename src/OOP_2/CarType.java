package OOP_2;

//  Enum - ще одна структура коду. Можна сказати, що Enum - тип даних із константними об'єктами. В Enum ми наперед
//  наголошуємо які будуть об'єкти цього типу і по-ходу виконання програми, ми не можемо змінити ці об'єкти. Ми не можемо
//  їхню кількість, не можемо поміняти їх самих. Enum мають охарактеризвувати в прогрмамі те, що не буде у нас змінюватися.

//  Enum може бути, як із полями, так і без них.

//  Для прикладу, коли ми оголосили один із об'єктів, SEDAN це буле рівне до:
//  public static final CarType Hatchback = new CarType();

public enum CarType implements ChangeCar {

//    SEDAN, SUV, HATCHBACK;
    SEDAN("Седан") {
        @Override
        public String draw() {
            return "Седан стає сірий";
        }
    },
    HATCHBACK("Хетчбек") {
        @Override
        public String draw() {
            return "Хетчбек стає червоним";
        }
    },
    SUV("Кросовер") {
        @Override
        public String draw() {
            return "Кросовер стає синів";
        }
    };

//  Наший enum може маті і поля. Всі об'єкти enum мають писатися лише нагорі. Поля мають писатися тільки нижче.
    private String UkrainianTranslation;

//  Ми можемо створити конструктор поля. По дефолту, конструктори enum є приватними. Одразу ми можемо побачити помилку.
//  Тепер enum має один конструктор із параметорм String. Тому воно хоче щоб ми цей string передали. Коли, для прикладу,
//  ми пишемо SEDAN("Седан"), це рівне до: public static final CarType sedan = new CarType("Седан");
    CarType(String ukrainian) {
        this.UkrainianTranslation = ukrainian;
    }

    public String getUkrainianTranslation() {
        return UkrainianTranslation;
    }

//  Але ми можемо міняти значення цих полів. Коли у нас об'єкт є константний, це не означає, що ми його не можемо поміняти.
//  final стосовно об'єкта означає, що ми не можемо помінти комірку об'єкта, але наповнення цієї комірки змінити ми можемо.

    public void setUkrainianTranslation(String ukrainianTranslation) {
        this.UkrainianTranslation = ukrainianTranslation;
    }

//  Звісно, що ми можемо зробити об'єкт, що він не зможе змінити і комірку і значення своє. Такі класи називатимуться
//  Immutable. До таких класів може належати String, LocalDate, Date. Це класи, які не можуть змінити свій особитий стан.

//  Константні класи (final) - ми не можемо змінити комірку їм, Immutable - класи, значення, поля об'єктів яких, ми не
//  можемо міняти взагалі.


    @Override
    public String toString() {
        return "CarType{" +
                "UkrainianTranslation='" + UkrainianTranslation + '\'' +
                '}';
    }

//  Також наш enum може імплементувати інтерфейси. Вони можуть мати таку річ, як абстрактний метод. Ми можемо зробити
//  імплементацію  на всі об'єкти enum або можемо зробити так, що на кожен із цих об'єктів, буде своя реалізація.

    @Override
    public String drawAllCars() {
        return "Малюємо машини наші";
    }

}

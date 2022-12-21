package OOP_2;

//  Як реалізувати композицію і агрегацію?. У нас є 2 конструктора. Якщо у нас є конструктор, який не вимагає від нас
//  об'єкт engine, це у нас є агрегація. Композиція є сильнішою за агрегацію. Перший конструктор каже, що ми можемо
//  створити машину і без двигуна - у engine буде відсутня комірка. Об'єкт зможе існувати.

// Якщо нащого конструктора без одного поля нема, це вже є сильніший зв'язок. Це вже композиція. Відповідно, ми не
// можемо мати об'єкт без об'єкту engine.

public class Car {

    private String brand;
    private int price;
    private Engine engine;

    private CarType carType;

    public Car(String brand, int price, Engine engine, CarType carType) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarType getCarType() {
        return this.carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void startCar() {
        final boolean isStarted = engine.startEngine();
        if (isStarted) {
            System.out.println(String.format("Car %s started!", this.brand));
        } else {
            System.out.println(String.format("You have wasted %s dollars for some %s shit", this.price, this.brand));
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", engine=" + engine +
                ", carType=" + carType +
                '}';
    }
}

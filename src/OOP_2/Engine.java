package OOP_2;

// Що таке асоціація, агрегація і композиція?
// Це все означає зв'язок між сутостями. Для прикладу, зв'язок наслідування - зв'язок is a: нащадок is a батько.

//  Композиція, агрецгація і асоціація - це зв'язок типу has a - щось має. Тобто, одна сутність містить у собі іншу сутність.
//  Автомобіль має двигун, студент має заліковку, людина має документ. Ці три терміни характеризують силу цього зв'язку: що
//  може або не може існувати без іншого. У Java, це все реалізовується, абсолютно одинаково.

//  Композиція - це тоді, коли поле нашого класу, є об'єкт іншого класу.

import java.util.Random;

public class Engine {

    private double volume;
    private int power;

    public Engine(double volume, int power) {
        this.volume = volume;
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean   startEngine() {
        Random random = new Random();
        final int nextInt = random.nextInt(5);
        if (nextInt > 1) {
            System.out.println(String.format("Engine is started with %s power", this.power));
            return true;
        } else {
            System.out.println("Engine is broken");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                '}';
    }
}

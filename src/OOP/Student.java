package OOP;

public class Student extends Person {

    private int point;
    private String group;

//  Для того що б створити нам клас Student, нам потрібно передати усі 5 полів (3 поля з Person i 2 нових із Student).
//  Super дозволяє нам звернутися до полів класу - батька (Person). Це те саме, що викликати конструктор класа Person.
//  Super може бути лише першим рядком у виклику конструктора класа нащадка.
//  Super нам викликати конструктор батьківського класу і доступитися до батьківських методів.

//  This надає доступ до всього що є в моєму класі: до моїх полів, до методів класу нащадка, а також до методів класу батька.
//  Super надає нам лише те, що є у батьківському класі - надає доступ до класу, до полів, методів класу нащадка.

//  Клас батько нічого не знає про своїх нащадків. Клас person може успадковувати будь який додатковий клас, клас Person
//  не буде нічого знати про це.

    public Student(int id, String name, int age, int point, String group) {
        super(id, name, age);
        this.point = point;
        this.group = group;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

//  Тут ми будемо переписувати метод нашого батька - класа Person. Після цього для Student, виклик методу буде інший.
//  Це і називається override методів - перепис методів
    @Override
    public void method() {
        System.out.println("I am a student");;
    }

    @Override
    public String toString() {
        return "Student{" + "point=" + point + ", group='" + group + '\'' + '}' + super.toString();
    }

}

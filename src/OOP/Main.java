package OOP;

public class Main {
    public static void main(String[] args) {

        Person p = new Person(1, "Taras", 22);
        Student s = new Student( 2, "Andriy", 22, 11, "KTM-51");
        Worker w = new Worker(3, "Petro", 45, 3000);

        Triangle triangle = new Triangle(1,4,4);
        Circle circle = new Circle(4);

        GeometricFigure[] figures = { triangle, circle };
        double totalSquare = 0;
        for (GeometricFigure figure: figures) {
            totalSquare += figure.calculateSquare();
        }
        System.out.println(totalSquare);

        /*
        GeometricFigure geometricFigure = new GeometricFigure(); // Error, will not compile
        */

        p.method();
        s.method();

        Person[] people = {p, s, w};
        for (Person person: people) {
            person.method();
        }

        p.method("Hi ");

        Person.staticMethod();
        p.method();
        System.out.println(Person.a);
        Person.a = 10;
        System.out.println(Person.a);

    }
}

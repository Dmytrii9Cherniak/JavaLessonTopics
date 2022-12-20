package OOP;

public class Triangle extends GeometricFigure implements ChangeSomeThing {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public int calculateSquare() {
        return a * b * c / (a + b);
    }

    @Override
    public void draw() {
        System.out.println("Triangle becomes red");
    }

}

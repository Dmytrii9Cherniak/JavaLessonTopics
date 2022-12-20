package OOP;

public class Circle extends GeometricFigure implements ChangeSomeThing {

    private final int radius;


    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculatePerimeter() {
        return radius;
    }

    @Override
    public int calculateSquare() {
        return radius * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle becomes blue");
    }

}

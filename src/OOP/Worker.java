package OOP;

public class Worker extends Person {

    private int salary;

    public Worker(int id, String name, int age, int salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void method() {
        System.out.println("I'm a worker");
    }

    @Override
    public String toString() {
        return "Worker{" + "salary=" + salary + '}' + super.toString();
    }

}

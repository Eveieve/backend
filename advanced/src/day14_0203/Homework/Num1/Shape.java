package day14_0203.Homework.Num1;

// abstract class can both have abstract methods and non abstract methods
public abstract class Shape {
    protected double area;
    private String name;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // abstract class cannot have a body
    public abstract void calculationArea();

    public void print() {
        System.out.println("class Shape's print method");
    }
}

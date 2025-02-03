package day14_0203.Homework.Num1;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String name) {
        super(name); //ㅁ문제조건
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // is implementing abstract method 'override'?
    @Override
    public void calculationArea() {
        this.area = this.radius * this.radius * PI; // 'area' is from parent
    }

    @Override
    public void print() {
        System.out.println("원의 면적은 " + this.area);
    }
}

package day14_0203.Homework.Num1;

public class Rectangle extends Shape{
private String width;
private String height;

//private double area;

public Rectangle(String width, String height){
    this.width = width;
    this.height = height;
}

    @Override
    public void calculationArea() {
        this.area = (Integer.parseInt(this.width))* (Integer.parseInt(this.height));
    }

    @Override
    public void print() {
        System.out.println("직사각형 면적은 " + this.area);
    }
}

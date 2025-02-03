package day14_0203.Homework.Num1;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2]; // shape is an array?

        Circle circle = new Circle(10.0, "원");
		//circle.setRadius(3.14);
		circle.calculationArea(); // 계산을 하고 프린트 해야 함
		circle.print();

		Rectangle rec = new Rectangle("20", "10");
		rec.calculationArea();
		rec.print();
    }
}

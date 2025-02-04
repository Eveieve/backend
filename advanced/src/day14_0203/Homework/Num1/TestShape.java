package day14_0203.Homework.Num1;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2]; // shape is an array?

        Circle circle = new Circle(10.0, "원");
		circle.calculationArea(); // 계산을 하고 프린트 해야 함

		Rectangle rec = new Rectangle("20", "10");
		rec.calculationArea();


		shapes[0] = circle;
		shapes[1] = rec;
		for(Shape shape : shapes) {
			//System.out.println(shape.print()); error
			shape.print();
			// Cannot invoke "day14_0203.Homework.Num1.Shape.print()" because "shape" is null
		}
    }
}

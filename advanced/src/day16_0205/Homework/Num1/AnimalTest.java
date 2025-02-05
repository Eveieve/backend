package day16_0205.Homework.Num1;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		if(cheatableChicken instanceof Cheatable){ // 치킨 객체가 치터블 인터페이스 구현했다면 플라이 메소두 수행.
			cheatableChicken.fly();
		}

		dog.run(1);
		chicken.run(1);
		cheatableChicken.run(1);

		dog.run(2);
		chicken.run(2);
		cheatableChicken.run(2);

		dog.run(3);
		chicken.run(3);
		cheatableChicken.run(3);

	}
}

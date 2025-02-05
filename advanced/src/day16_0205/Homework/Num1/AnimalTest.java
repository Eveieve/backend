package day16_0205.Homework.Num1;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3); // 애니멀 클래스 타입인 치킨??
		Chicken cheatableChicken = new Chicken(5); // 치터블 타입인 치킨?? 두 치킨의 차이점?

		if(cheatableChicken instanceof Cheatable){ // 치킨 객체가 치터블 인터페이스 구현했다면 플라이 메소드 수행.
			cheatableChicken.fly(); // 스피드 두배.
		}


		for(int i =1; i <=3; i++){
			dog.run(i);
			System.out.println("개의 이동 거리 = " + dog.getDistance());
			chicken.run(i);
			cheatableChicken.fly(i);
		}
//
//
//		dog.run(1);
//		chicken.run(1);
//		//cheatableChicken.run(1);
//		// chicken.fly(1); // 치킨은 플라이 불가.
//		cheatableChicken.fly(1);
//
//
//		dog.run(2);
//		chicken.run(2);
//		cheatableChicken.fly(2); // fly(int hours)로 인터페이스 정의하는걸로 바꿈.
//
//		dog.run(3);
//		chicken.run(3);
//		cheatableChicken.fly(3);

	}
}

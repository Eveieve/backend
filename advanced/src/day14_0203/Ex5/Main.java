package day14_0203.Ex5;

// Demonstrate 'Promotion' concept.

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        // cat1 의 타입은 Cat 이지만 Cat은 Animal을 상속받기 때문에 Animal 타입의 animal 에 cat1을 자동 캐스팅하여 넣어줄 수 있음.

        Animal animal = (Cat) cat1; // automatic promotion

        // cat and animal instances are referencing Cat instance
        System.out.println(cat1 == animal); // 상속에서 자동 타입 변환 일어남.
    }
}

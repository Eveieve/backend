package day14_0203.Ex5;

// Demonstrate 'Promotion' concept.

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        Animal animal = (Cat) cat1; // automatic promotion
        // 애니멀은 캣을 가리키라고 함????
        // cat and animal instances are referencing Cat instance
        System.out.println(cat1 == animal); // 상속에서 자동 타입 변환 일어남.
    }
}

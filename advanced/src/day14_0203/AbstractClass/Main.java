package day14_0203.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        animalSound(dog); // 이렇게 하면 각각 ..! 이게 낫겠지 .
        // -> 자동 타입 변환 (프로모션)됨.
        animalSound(cat); // api는 부모 타입을 패스함. 그러면 자식 타입을 이렇게 패스 가능.
    }

    // 스태틱으로 해야 하나?
    public static void animalSound(Animal animal) {
        if(animal instanceof Cat || animal instanceof Dog)
            animal.sound();
        else
            System.out.println("not the type i want");
    }
}

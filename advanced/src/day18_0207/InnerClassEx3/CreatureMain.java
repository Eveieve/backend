package day18_0207.InnerClassEx3;

class Creature {
    int life;

    Creature(Animal animal) {
        Animal animal1 = animal;
    }

    public void method1() {
       // Animal animal = new Animal();
    }
}

class Animal{

}

public class CreatureMain{
    Animal animal = new Animal(); // 워래 이렇게 하는걸 내부에서 생성하면 더 효율적이다!
    Creature creature = new Creature(animal);

}

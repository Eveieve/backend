package day16_0205.Ex2;

public class Cat implements Animal, Pet{

    public Cat(){

    }

    @Override
    public void play() {
        System.out.println("Cat plays.");
    }

    @Override
    public void cry() {
        System.out.println("Cat cries.");
    }

    public void hasTail() {
        Tail catTail = new Tail(); //?
    }
}

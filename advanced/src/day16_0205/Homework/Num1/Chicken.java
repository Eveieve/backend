package day16_0205.Homework.Num1;

// 원래 abstract 클래스를 extends 하는거였나
// -> 자식들이 내가 정해놓은 기능을 다 구현하도록
public class Chicken extends Animal implements Cheatable { // extends 와 implements 함께 쓸때 **

    public Chicken(int speed){
        super(speed);

    }

    @Override
    void run(int hours) {
            this.setDistance(this.getSpeed() * hours);
            System.out.println("닭의 이동 거리 = " + this.getDistance());
    }

    // Override from Cheatable interface
    @Override
    public void fly(int hours) {
        this.setSpeed(this.getSpeed() *2); // 스피드 두배 증가
        //run(this.getSpeed());
        this.setDistance(this.getSpeed() * hours);
        System.out.println("나는 닭의 이동 거리 = " + this.getDistance());
    }
}

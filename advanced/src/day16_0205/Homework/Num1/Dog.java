package day16_0205.Homework.Num1;

public class Dog extends Animal{
    public Dog(int speed) {
        super(speed);

    }

    @Override
    void run(int hours) {
        System.out.println(hours + "시간 후");
        this.setDistance(this.getSpeed() *(( double)hours/2));
    }


}

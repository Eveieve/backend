package day14_0203.Homework.Num4;

public class Truck extends Wheeler{
//protected int velocity;
//protected String carName;

    public Truck(String carName, int velocity) {
        super(carName, velocity);
        //this.velocity = velocity;
    }

    public Truck(String carName, int velocity, int wheelNumber) {
        super(carName, velocity, wheelNumber);
        //this.velocity = velocity;
    }

    @Override
    public void speedUp(int speed) {
        if(this.velocity > 100)
            this.velocity = 100;
        else
            this.velocity += speed * 5;
        // 출력결과처럼 출력하도록 한다??가 무슨의미
    }

    @Override
    public void speedDown(int speed) {
        if(this.velocity < 50)
            this.velocity = 50;
        else
            this.velocity -= speed * 5;
    }

}

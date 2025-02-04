package day14_0203.Homework.Num4;

public class Bike extends Wheeler{
    public Bike(String carName, int velocity) {
        super(carName, velocity);
    }
    public Bike(String carName, int velocity, int wheelNumber) {
        super(carName, velocity, wheelNumber);
    }


    @Override
    public void speedUp(int speed) {
        if(this.velocity > 40)
            this.velocity = 40;
        else
            this.velocity += speed;
        // 출력결과처럼 출력하도록 한다??가 무슨의미
    }

    @Override
    public void speedDown(int speed) {
        if(this.velocity < 10)
            this.velocity = 10;
        else
            this.velocity -= speed;
    }
}

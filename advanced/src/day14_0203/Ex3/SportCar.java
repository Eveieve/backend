package day14_0203.Ex3;

public class SportCar extends Car{

    private int speed;

//    public SportCar() {
//    } // constructor is not necessary

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp() {
        this.speed += 10; // redefine. Instance has all parent's field.
    }
}

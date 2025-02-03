package day14_0203.Ex3;

public class Car {
    private int speed;

    //stop()
    public final void stop() {
        System.out.println("car stopped");

        setSpeed(0);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp() {
        this.speed += 1;
    }

    public void printSpeed() {
        System.out.println(getSpeed());
    }
}

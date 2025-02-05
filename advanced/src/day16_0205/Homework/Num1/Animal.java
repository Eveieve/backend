package day16_0205.Homework.Num1;

public abstract class Animal {
    private int speed;
    private double distance;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    abstract void run (int hours);

    double getDistance(){

        return this.distance; // 애니멀로부터 생성된 객체의 디스턴스 리턴.

    }



}

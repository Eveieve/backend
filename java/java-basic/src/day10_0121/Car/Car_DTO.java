package day10_0121.Car;

public class Car_DTO {

    // model, owner, speed

    private String model;
    private String owner;
    private int speed;


    // get car object as argument for constructor
    public Car_DTO(){

    }

    public Car_DTO(String model){
        // constructor that gets model name as argument.
        // Initialized with the model name.
        // is it more helpful to initialized with something than nothing when creating an instance using constructor?

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

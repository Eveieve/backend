package day10_0121.Car;

public class CarMain {
    public static void main(String[] args) {

        // create your car
        Car_DTO myCar = new Car_DTO("BMW"); // Q. Do I need to create the object with default constructor? or user-defined constructor?

        Car_DAO myCar_now = new Car_DAO(myCar);


        for(int i =0; i<10; i++){
            myCar_now.increaseSpeed(myCar); // pass DTO object?
        }

        for(int i =0; i<10; i++){
            myCar_now.decreaseSpeed(myCar); // pass DTO object?
        }

        // Mission completed.
    }
}

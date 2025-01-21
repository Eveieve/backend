package day10_0121.Car;

import day10_0121.DTO.CarDTO;

public class Car_DAO {
    private Car_DTO car_DTO;

    // create car object from CarDTO
    Car_DTO carDTO = new Car_DTO("santafe");// need to be instanced to use its methods.

    // constructor, expecting a DTO object
    public Car_DAO(Car_DTO car_DTO) {
        this.car_DTO = car_DTO; // pass car_DTO object
    }

    public void insert() {

        System.out.println(carDTO.getModel() + " : insert one car into the database");
    }

    public void increaseSpeed(Car_DTO carDTO) {
        // get speed first
        // increase by 1
        int increased = carDTO.getSpeed() + 1;
        carDTO.setSpeed(increased); // passes value that has been incremented by 1.
        System.out.println(carDTO.getSpeed()); // print out current speed
    }

    public void decreaseSpeed(Car_DTO carDTO) { // data manipulation on the data model(DTO model)
        int decreased = carDTO.getSpeed() -1;
        carDTO.setSpeed(decreased);
        if(carDTO.getSpeed() == 0){
            System.out.println("Stop!! Current speed is 0.");
        } else {
            System.out.println(carDTO.getSpeed());
        }
    }

}

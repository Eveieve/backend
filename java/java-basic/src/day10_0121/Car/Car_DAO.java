package day10_0121.Car;

import day10_0121.DTO.CarDTO;

public class Car_DAO {

    // get CAR DTO as argument

    private Car_DTO car_DTO;
    // create car object from CarDTO

    // constructor
    public Car_DAO(CarDTO car_DTO) {
        this.car_DTO = car_DTO;
    }

    public void insert() {
        // 생성자로 CarDTO car 정보 넘겨주었으니 insert의 파라미터에 받을 필요 없음.==> hm..
        System.out.println(car.getModel() + " : insert one car into the database");
    }

}

package day10_0121.DAO;

import day10_0121.DTO.CarDTO;

public class CarDAO {

    private CarDTO car;
    // create car object from CarDTO

    // constructor
    public CarDAO(CarDTO car) {
        this.car = car;
    }

    public void insert() {
        // 생성자로 CarDTO car 정보 넘겨주었으니 insert의 파라미터에 받을 필요 없음.==> hm..
        System.out.println(car.getModel() + " : insert one car into the database");
    }

    public void delete(){
        System.out.println("delete one car from the database");
    }
    public void select(){
        System.out.println("select one car from the database");
    }
    public void update(){
        System.out.println("update one car on the database");
    }
}

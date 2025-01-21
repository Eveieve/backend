package day10_0121;

import day10_0121.DAO.CarDAO;
import day10_0121.DTO.CarDTO;
import day10_0121.DTO.Tire;

public class CarMain {
    public static void main(String[] args) {
        // main class that has the main method.
        // this is where the instances are created from classes.


        CarDTO car1 = new CarDTO();

        Tire tire = new Tire();

        tire.setModel("blue tire");

        CarDTO car2 = new CarDTO("casper", tire); // tire 를 넘겨주기.
        // car2 는 blue tire 장착한 casper.
        // casper car 정보를 데베에 저장하고 싶음 -> DAO class 쓰기.
        CarDAO cardao = new CarDAO(car2); // hover over to check what needs to be passed when creating an instace.
        // car2 에 대한 데이터 조작을 위해 carDAO 객체 만들어주기
        // car2 carDAO 이런식으로 naming 하면 더 좋을까?
        // 메인클래스에는 인스턴스화 하고, 그걸 연결해주는 것만 있음.
        // 나중에는 함수 하나만 있게 됨. -> 구조화를 많이 하면.
        cardao.insert();
        cardao.delete();
        cardao.select();
        cardao.update();

    }
}

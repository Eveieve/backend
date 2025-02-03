package day14_0203.Ex10;

class Vehicle{

    void run() {
        System.out.println("vehicle runs.");
    }
}

class Bus extends Vehicle{

    @Override
    void run() {
        System.out.println("bus runs.");
    }
}

class Taxi extends Vehicle {

    @Override
    void run() {
        System.out.println("taxi runs.");
    }
}

class Bicycle extends Vehicle {

    @Override
    void run() {
        System.out.println("bicycle runs.");
    }
}
class Driver {


    // bus만 드라이브 가능한게 아니잖아!
    // 클래스 타입의 매개변수를 파라미터로. - 다형성 이용 가능.
    void drive(Vehicle vehicle) {
        // 패스되는 vehicle이 택시 타입이냐, 버스 타입이냐?
        if(vehicle instanceof Taxi || vehicle instanceof Bus)
            vehicle.run(); // 부모 타입의 메소드
        else
            System.out.println("not the type i want. ");
//        Object obj = vehicle; // 프로모션
//        Vehicle v = (Vehicle) obj;// 캐스팅
//        vehicle.run();

    }
}

class Horse {

}
class Main{
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus(); // 하위 자식들은 다 받을 수 있는 drive()
        driver.drive(bus); // vehicle type was the parameter - can pass bus type

        Taxi taxi = new Taxi();
        driver.drive(taxi);

        Horse horse = new Horse();
        //Driver.drive(horse); // cannot pass Horse type, bc Horse type is not in parent child relationship with vehicle.
    }
}

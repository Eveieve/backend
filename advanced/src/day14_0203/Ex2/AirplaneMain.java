package day14_0203.Ex2;

public class AirplaneMain {
    public static void main(String[] args) {

        // create Airplane instance
        Airplane plane = new Airplane();
        plane.depart();
        plane.fly();
        plane.land();

        SuperAirplane superplane = new SuperAirplane();
        superplane.depart();
        // do not set hard value (number) - use predefined constant values
        superplane.flymode = SuperAirplane.ADVANCED; // class SuperAirplane's static constant 'ADVANCED'
        superplane.fly();
        superplane.land();


    }
}

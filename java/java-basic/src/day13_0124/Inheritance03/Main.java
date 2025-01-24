package day13_0124.Inheritance03;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("LG", "PLK1973", "2183729182");

        phone2.ring();
        //phone2.setwifi(); error

        Phone smartph2 = new SmartPhone();
        smartph2.receiveCall("Grandfather");
        //smartph2.setwifi(); Phone 타입이기 떄문에 스마트폰 기능 사용 불가.

        SmartPhone smartPh = new SmartPhone();
        smartPh.setWifi(true);
        smartPh.sendCall("Tom");
        smartPh.receiveCall("John"); // returns caller
        smartPh.hangUp("John");


        SmartPhone iphone16 = new SmartPhone("Apple", "Iphone16", "91210983");

        iphone16.setWifi(true);
        iphone16.receiveCall("Jack");
        iphone16.receiveCall("Sophie");
        iphone16.hangUp("Sophie");


    }
}

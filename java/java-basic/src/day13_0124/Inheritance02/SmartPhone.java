package day13_0124.Inheritance02;

//모든 클래스는 쓰레드 단위로 운영되기 때문에 모든 클래스는 다 extends Object 하는 것임.
public class SmartPhone extends Phone {

    private boolean wifi;
    private boolean LTE;


    public SmartPhone() {
        super(); // 컴파일러가 부모의 생성자 만듦. 직접 작성하지 않아도.
    }


    public SmartPhone(String vendor, String model, String number) {
//        this.vendor = vendor;
//        this.model = model;
//        this.color = number;
        super(vendor, model, number); // 이부분 작성하지 않아도 컴파일러가 해줌.

        this.wifi = wifi; // 만약 이걸 쓰려면 super 밑에 쓰기.
        // this. 는 클래스로 생성된 나. this instance 를 가리킴.
    }

    public SmartPhone(String vendor, String model, String number, boolean wifi) {
//        this.vendor = vendor;
//        this.model = model;
//        this.color = number;
        super(vendor, model, number); // 작성하지 않아도 컴파일러가 해줌.

        this.wifi = wifi; // 만약 이걸 쓰려면 super 밑에 쓰기.
        // this. 는 클래스로 생성된 나. this instance 를 가리킴.
    }

    public void deviceInfo() {
        super.getVendor(); // 가능! 상위 클래스의 멤버를 super. 로 접근 가능.
        //super.ring(); // 상위 클래스의 메서드를 super 로 접근가능.
    }

    public void setWifi(boolean wifi) {
        super.getModel(); // 나의 모델은 ~
        this.wifi = wifi; // 나의 멤버는 this.
        this.wifi = super.hasWifi();
        System.out.println("set wifi");
        connectInternet();
    }

    public void setLTE(boolean LET) {
        if (LTE) {
            System.out.println("use LTE");
            connectInternet();
        } else System.out.println("LTE not connected");

    }


    public void connectInternet() {
        System.out.println("Connect Internet");
    }

}

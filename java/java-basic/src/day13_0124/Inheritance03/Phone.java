package day13_0124.Inheritance03;

public class Phone {
    // members
    private String vendor = "Apple";
    private String model = "Iphone16";
    private String number = "01027361936";
    private String lastCall;

    // constructor
    public Phone() {
        System.out.println("Phone default constructor");
    }

    // 초기화를 안해도 됨?
    public Phone(String vendor, String model, String number) {
        this.vendor = vendor;
        this.model = model;
        this.number = number; // Phone 필드에 넘겨받은 값들로 초기화
    }

    public String getVendor() {
        return this.vendor;
    }

    // member methods
    public String getModel() {
        System.out.println(this.model);
        return this.model; // 인스턴스에 붙은 model  멤버 값 돌려주기
    }

    public boolean hasWifi() {
        return false; // Phone does not have wifi. Useful for when you do not know whether it's a smartphone or not!
    }

    // bell rings
    public void ring() {
        System.out.println("phone rings");
    }

    // sends voice message
    public void sendCall(String receiver) {
        System.out.println("Call... " + receiver);
    }

    public String receiveCall(String caller) {
        System.out.println("Receiving call from..." + caller);

        return caller;
    }

    public String hangUp(String caller) {
        System.out.println("Hangup...." + caller);
        this.lastCall = caller;

        return caller;
    }

}

package java_prac.ch6;

// 설계도 작성
public class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power =! power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel --;
    }

    public static void main(String[] args) {
        Tv tv; // 참조변서 선언.
        tv = new Tv(); // tv인스턴스 생성후, 생성된 티비의 인스턴스 주소를 참조변수 tv에 저장한다.
        tv.channel = 7; // 객체 사용
        tv.channelUp();

    }
}

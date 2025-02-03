package day14_0203.Ex8;

public class Main {
    public static void main(String[] args) {
        Tv tv_remotecontrol1 = new Tv();
        Tv tv_remotecontrol2 = new SmartTv(); //부모타입으로 자식 클래스타입 받아 초기화
        // 그럼 화살표로 new smartTv 가리키는건가?
        // -> 티비 클래스 타입의 참조변수 tv_remotecontrol2 선언 하고, SmartTv 인스턴스를 생성하여, 이 인스턴스의 주소값을 참조변수 tv remotecontrol2에 대입한다.
        SmartTv smart_remotecontrol = new SmartTv();

        Tv tv = new Tv();
        SmartTv smart_control = (SmartTv) tv;  // 자식 타입으로 캐스팅.
    }
}

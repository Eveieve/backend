package day15_0204.Ex5;

// 상속 받아야 사용자정의 익셉션 만들 수 있음.
public class InsufficientEx extends Exception{ // 일반 예외로 선언한 사용자정의 예외 클래스.

    public InsufficientEx(){};

    public InsufficientEx(String message) {
        super(message); // 나의 필드엔 message 필드 없으니 슈퍼 클래스에 있다고 짐작하는건가?
    }


}

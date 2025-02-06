package day17_0206.Quiz.Num4;

// action() 메소드를 호출할 때 매개값이 C 객체일 경우에만 method2가 호출되도록 하기

// 액션 메소드가 어딨는데?
public class Main {
    // 매개값이 씨 객체 일 경우에만
    public static void action(C objC) {
        if(objC instanceof C) { // 매개값이 씨 객체일 경우에만' 을 체크??
            objC.method2();
        }
    }
    public static void main(String[] args) {
        C objC = new C();

        action(objC); // ㅅ매개값이 씨 객체일 경우에만


    }
}

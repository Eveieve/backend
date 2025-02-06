package day17_0206.Quiz.Num4;

// action() 메소드를 호출할 때 매개값이 C 객체일 경우에만 method2가 호출되도록 하기

// 액션 메소드가 어딨는데?
public class Main {
    // 액션을 호출할때, 매개값이 씨 객체 일 경우에만 메소드2를 실행하라
    public static void action(InterA obj) { // 뭘 던져도 실생할 수 있겍끔 - InerfaceA
        if(obj instanceof C) { // 매개값이 씨 객체일 경우에만' 을 체크??
            ((C) obj).method2(); // 원랜 캐스팅을 통해서만 각자 클래스의 메소드를 호출 할 수 있다.
            // -> 만약 파라미터로 C obj 를 넣으면 씨 객체만 받게 되니까 obj가 씨 객체임을 가정한다.

            //obj.method2(); error -> InterA 에는 method2가 없다!
            // 하지만 손으로 캐스팅 하지 않아도 컴파일러가 자동 캐스팅 해주는 경우이다 (InterA를 구현하는 C 니까 범위가 더 작아서)
            //((C) obj).method1(); // 간접적으로 method2 호출할 수도 있음.
            // C.method2();
        }

        //obj.method1(); // B만 실행되겠지, 위에서 걸렀으니
    }
    public static void main(String[] args) {
        C objC = new C();

        action(objC); // 매개값이 씨 객체일 경우에만


    }
}

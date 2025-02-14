package day23.Lambda01;

public class Lambda01 {
    public static void main(String[] args) {

        // 같은 클래스 내 선언된 메소드.
       action((x,y) -> {
           int result = x + y;
           System.out.println("result1 =" + result);
       });

        // 같은 클래스 내 선언된 메소드.
        action((x,y) -> {
            int result = x - y;
            System.out.println("result1 =" + result);
        });

    }

    // 메인 클래스에 붙은 스태틱
    // 카큘러블 클래스에서 생성되는 타입 받을 수 있음.
    public static void action(Calculable calculable) {
        int x = 10;
        int y = 20;
        // 카큘러블은 함수형 인터페이스. 함수형 인터페이스에 정의된 하나의 메소드 calculate.
        // x, y 는 로컬 변수.
        calculable.calculate(x,y);
    }
}

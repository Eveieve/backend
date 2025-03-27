package Lambda.ex1;

/**
 * 람다식 예제
 */
@FunctionalInterface // 함수형 인터페이스 선언
interface MyFunction {
    void run();
}

/**
 * class
 */
class Ex14_1 {
    // 매겨변수 타입이 MyFunction 인 execute 메서드
    static void execute(MyFunction f) {
        f.run();
    }

    // 함수형 인터페이스를 반환하는 메서드
    static MyFunction getMyFunction() {
        // 함수형 인터페이스가 람다식을 가리킴
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    // main method
    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        // 또, 익명 클래스로 run() 구현 가능.
        MyFunction f2 = new MyFunction() {
            public void run() { // public 반드시 붙여야 함
                System.out.println("f2.run()");
            }
        };

        // 반환 타입이 함수형 인터페이스 MyFunction 인 메서드
        MyFunction f3 = getMyFunction();
        f1.run();
        f2.run();

        // 람다식을 넘겨줌
        // f1.run() 하는 것과 같음
        execute(f1);
        execute(()-> System.out.println("run()"));
    }
}

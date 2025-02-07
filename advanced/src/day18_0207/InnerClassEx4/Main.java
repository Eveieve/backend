package day18_0207.InnerClassEx4;

class A {

    static class B {
    }


    B field1 = new B();

    static B field2 = new B();

    // 에이 생성자에서 비 생성가능
    A() {
        B b = new B();
    }

    // can create b in A method
    void method1() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }

}


public class Main {

    public static void main(String[] args) {
        // 정적 멤버 클래스 비 내부에 A.B() 생성
        A.B b = new A.B();
    }
}

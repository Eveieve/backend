package day18_0207.InnerClass;

// B 객체는 에이 클래스 내부에서 생성할 수 없고, 인스턴스 필드 값, 생성자, 인스턴스 메소드에서 생성할 수 있다.
public class A {
    // 인스턴스 멤버 클래스
    class B {

    }; // 이너 클래스 (인스턴스 멤버 클래스)

    // 인스턴스의 필드 값으로 B 객체 생성하여 대입. 인스턴스 필드 값이 어딨는데? 무슨인스턴스?
    B field= new B();

    // A 생성자
    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }
}

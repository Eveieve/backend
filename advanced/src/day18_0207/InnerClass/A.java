package day18_0207.InnerClass;

// B 객체는 에이 클래스 내부에서 생성할 수 없고, 인스턴스 필드 값, 생성자, 인스턴스 메소드에서만 생성할 수 있다.
public class A {

    // 인스턴스 멤버 클래스 비
    class B {
        // instance field
        int field1 = 10;
        static int field2 = 20;

        //constructor
        B() {
            System.out.println("B's constructor ");
        }

        // instance method
        void method1() {
            System.out.println("B's method1");
        }

        static void method2() {
            System.out.println("B's static method2");
        }
    }; // B 이너 클래스 (인스턴스 멤버 클래스)

    // instance method
    // 비 객체를 쓰기 위한 에이의 메소드
    void useB() {
        B b = new B();
        System.out.println("Use class B's filed: " + b. field1);
        b.method1();

        System.out.println("B's static field and static method");
        System.out.println(B.field2);
        B.method2();
    }
    // 인스턴스의 필드 값으로 B 객체 생성하여 대입. 인스턴스 필드 값이 어딨는데? 무슨인스턴스?
    B field= new B();

    // A 생성자
    // 에이 생성자에서 비 인스턴스 멤버 클래스를 생성 가능하다.
    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }
}

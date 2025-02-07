package day18_0207.InnerClass;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        // 에이 객체가 먼저 생성 된 후,  에이값을 참조하여 비 객체 생성가능.
        A.B b = a.new B(); // 비 인스턴스를 외부에서 생성하는법

        // 또는 에이 객체의 useB 메소드를 통한 B 객체 생성
        a.useB();
    }
}

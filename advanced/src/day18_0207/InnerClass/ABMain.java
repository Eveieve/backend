package day18_0207.InnerClass;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        // 에이값을 참조하여 비 객체 생성.
        A.B b = a.new B(); // 비 인스턴스를 외부에서 생성하는법 -> 윗줄처럼 에이 클래스에서 에이 객체가 먼저 생성되어야 함.


    }
}

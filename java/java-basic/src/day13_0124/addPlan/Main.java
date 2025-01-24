package day13_0124.addPlan;

class A {
    int aa =10;
    void methodA(){
        System.out.println("A클래스의 메소드 methodA");
    }
    void methodCompute(){  //오버라이드 대상메소드
        System.out.println("A클래스의 메소드 methodCompute");
    }
}

class B extends A {
    int bb = 20;
    void methodB(){

        System.out.println("B클래스의 메소드 methodB");
    }

    @Override
    void methodCompute() {
        System.out.println("A클래스의 재정의 메소드 호출");
        super.methodCompute();
        System.out.println("B클래스의 재정의된 메소드 methodCompute");
    }
}

class C extends B {
    int cc = 30;
    void methodC(){
        System.out.println("C클래스의 메소드 methodC");
    }

    @Override
    void methodCompute() {
        System.out.println("B클래스의 재정의 메소드 호출");
        super.methodCompute();
        System.out.println("C클래스의 재정의된 메소드 methodCompute");
    }
}


public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        //a,b,c 참조값이 나타낼 수 있는 멤버변수들의 갯수를 비교
        System.out.println( a.aa + "A클래스의 멤버 개수 : 1개 ");
        System.out.println( b.aa + " " + b.bb + " B클래스의 멤버 변수 : 2개 ");
        System.out.println( c.aa + " " + b.bb +  " " + c.cc + " C클래스의 멤버 변수 : 3개 ");

        //업캐스팅   c -> b  c - >a
        B cc1 = (B)c;
        System.out.println( cc1.aa + "A클래스의 멤버 개수 : 1개 ");
        System.out.println( cc1.aa + " " +cc1.bb + " B클래스의 멤버 변수 : 2개 ");
        //System.out.println( cc1.aa + " " + cc1.bb +  " " + cc1.cc + " C클래스의 멤버 변수 : 3개 ");

        A cc2 = (A)c;
        System.out.println( cc2.aa + "A클래스의 멤버 개수 : 1개 ");
        // System.out.println( cc2.aa + " " + cc2.bb + " B클래스의 멤버 변수 : 2개 ");
        // System.out.println( c.aa + " " + cc2.bb +  " " + cc2.cc + " C클래스의 멤버 변수 : 3개 ");

        //다운 캐스팅  A - > B    B->C
        B bb= (B)a;
        C cc = (C)bb;
//        System.out.println( cc.aa + "A클래스의 멤버 개수 : 1개 ");
//        System.out.println( cc.aa + " " + cc.bb + " B클래스의 멤버 변수 : 2개 ");
//        System.out.println( cc.aa + " " + cc.bb +  " " + cc.cc + " C클래스의 멤버 변수 : 3개 ");


        c.methodA();
        c.methodB();
        c.methodC();

        c.methodCompute();
    }



}
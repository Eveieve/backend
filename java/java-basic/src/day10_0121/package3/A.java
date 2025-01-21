package day10_0121.package3;

public class A {



    public int field1;
    int field2;
    private int field3;

    public A() {
        field1 =1;
        field2 =1;
        field3 =1;

        method1();
        method1(); // 메소드를 생성자에 넣으면 메인 메서드에서 object 를 instance 시키기만 하면 알아서 돌아감
        // 스프링 부트 도 이렇게 되어있음.
        // 메인은 점점 깔끔해질것임. 시작점 action 만 할 수 있게끔 설계할것이다.
    } //constructor that initializes fields to 1

    public void method1() {
        System.out.printf("%d %d %d %n", this.field1, this.field2, this.field3);
        // method2(); ==> method chaining 이라고 함.
        // action! 만하면 내부에서 돌아가도록.
    } // method that prints the object's data values

    public void method2() {
        System.out.printf("%d %d %d %n", this.field1, this.field2, this.field3);
    }
}

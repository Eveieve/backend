package day17_0206.Quiz.Num4;

public class C implements InterA{
    // method1 is from InterA
    @Override
    public void method1() {
        System.out.println("Implemented InterA, class C's method1");
        //method2(); //간접적으로 mehthod2 호출 하기 위해.
    }

    // class C's method
    public void method2() {
        System.out.println("Class C's method2");
    }
}

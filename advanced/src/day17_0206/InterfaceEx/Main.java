package day17_0206.InterfaceEx;

public class Main {
    public static void main(String[] args) {
        ABCImpl abcImpl = new ABCImpl();

        InterA ia = abcImpl;
        ia.methodA();
        System.out.println();
        InterB ib = abcImpl;
        ib.methodB();
        // ib.methodA();

        System.out.println();

    }

}
//

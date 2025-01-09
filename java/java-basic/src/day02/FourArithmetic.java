package day02;

public class FourArithmetic {
    static int a = 12;
    static int b = 2;

    public static void main(String[] args) {
        add();
        minus();
        multiply();
        divide();
    }

    public static int add() {
        int result = a+b;
        System.out.println(result);
        return result;
    }

    public static int multiply() {
        int result = a+b;
        System.out.println(result);
        return result;
    }

    public static int minus() {
        int result = a-b;
        System.out.println(result);
        return result;
    }

    public static int divide() {
        int result = a/b;
        System.out.println(result);
        return result;
    }
}

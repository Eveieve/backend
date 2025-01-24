package day13_0124.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        CalCircle c1 = new CalCircle();
        double result = c1.areaCircle(10);
        System.out.println("원의 면적: " + result);

        CalCircle2 c2 = new CalCircle2();
        result = c2.areaCircle(20);

    }
}

package day03.jungol.입력;

public class 연습4 {
    public static void main(String[] args) {
        final double PI = 3.140000;
        int r = 5;
        double area = r * r * PI;
        double circum = r * 2 * PI;
        System.out.printf("원주 = %d * 2 * %f = %f\n", r, PI, circum);
        System.out.printf("넓이 = %d * %d * %f = %f", r, r,  PI, area);

    }
}

package day04;

public class BitOperatorEx {
    public static void main(String[] args) {
        int n1 = 10; // 0000 1010
        int n2 = 11; // 0000 1011 => 0000 1010 비트 논리곱

        System.out.println("n1 : " + Integer.toBinaryString(n1));
        System.out.println("n2 : " + Integer.toBinaryString(n2));

        System.out.println("n1 & n2 : " + Integer.toBinaryString(n1 & n2));
        System.out.println("n1 & n2 : " + Integer.toBinaryString(n1 | n2));
        System.out.println("n1 & n2 : " + Integer.toBinaryString(n1 ^ n2)); // 서로 다를 경우에만 1
        System.out.println("!n1 : " + Integer.toBinaryString(~n1)); // 서로 다를 경우에만 1



    }
}

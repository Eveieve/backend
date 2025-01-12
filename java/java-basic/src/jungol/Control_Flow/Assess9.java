package jungol.Control_Flow;
import java.util.Scanner;
public class Assess9 {
    public static void main(String[] args) {
        // 최솟값 구하기.
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int small = 0;

        if(num1<= num2 && num1 <=num3)
            small = num1;
        else if(num2 <= num1 && num2 <=num3)
            small = num2;
        else
            small = num3;

        System.out.println(small);
    }
}

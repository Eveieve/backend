package jungol.Operator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Assess8 {
    public static void main(String[] args) {
        // 1이면 true, 0이면 false출력한다.

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int res1 = 0;
        int res2 = 0;

        // 첫번째 수가 가장 크면 1 출력
        if(num1>= num2 && num1 >= num3)
            res1 = 1;

        if(num1 == num2 && num2 == num3)
            res2 = 0;

        System.out.printf("%d %d", res1, res2);
    }


}

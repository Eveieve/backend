package jungol.Operator;

import java.util.Scanner;

public class Assess7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        boolean res = (num1 !=0);
        boolean res2;

        res2 = num2 != 0;


        int say, say2;

        if(res)
            say = 0;
        else
            say = 1;

        if(res2)
            say2 = 0;
        else
            say2 = 1;

        String resstr1 = String.valueOf(res);
        String resstr2 = String.valueOf(res2);

        System.out.printf("%d %d\n", say, say2);
        System.out.println("[JAVA]");
        System.out.printf("%b %b", resstr1, resstr2);


    }
}

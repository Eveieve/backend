package jungol.Loops1;

import java.util.Scanner;

public class Assess3 {
    public static void main(String[] args) {
        // postivie or negative ? -> loop

        Scanner sc = new Scanner(System.in);


        String say = " ";


        while (true) { // 계속 반복하라
            System.out.print("number? ");
            int num = sc.nextInt();

            if (num > 0 && num !=0 )
                say = "positive integer";
            else if (num < 0 && num != 0)
                say = "negative integer";
            else // 0 일때만 남음.
                break;

            System.out.println(say);

        }

    }
}

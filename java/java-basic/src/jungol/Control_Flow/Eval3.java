package jungol.Control_Flow;

import java.util.Scanner;

public class Eval3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        String say = " ";

        if (year % 400 == 0)
            say = "leap year";
        else if ((year % 4 == 0) && (year % 100 != 0))
            say = "leap year";
        else
            say = "common year";

        System.out.println(say);
    }
}

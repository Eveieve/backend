package jungol.Operator;

import java.util.Scanner;

public class Assess6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int say = 0;

        if(a>b)
            say =1;
        else if (b>=c)
            say = 1;
        else if (a <= b)
            say = 1;
        else if(b<c)
            say = 1;
    }
}

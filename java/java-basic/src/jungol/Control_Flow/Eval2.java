package jungol.Control_Flow;

import java.util.Scanner;

//형성평가2
public class Eval2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String say = " ";

        if(num == 0)
            say = "zero";
        else if (num > 0)
            say = "plus";
        else
            say = "minus";

        System.out.println(say);
    }
}

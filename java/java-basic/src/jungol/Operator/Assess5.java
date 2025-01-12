package jungol.Operator;

import java.util.Scanner;

public class Assess5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int say = 0;
        int say2 = 0;

        if(num1 == num2){
            say = 1;
            say2 = 0;
        } else{
            say = 0;
            say2 = 1;
        }

        System.out.println(say);
        System.out.println(say2);


    }
}

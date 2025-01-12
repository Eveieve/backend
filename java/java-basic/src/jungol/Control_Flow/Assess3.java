package jungol.Control_Flow;

import java.util.Scanner;

public class Assess3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();

        if(in>=20)
            System.out.println("adult");
        else{
            int left = 20 - in;
            System.out.printf("%d years later", left);
        }

    }
}

package jungol.Loops3;

import java.util.Scanner;

public class Assess3_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        for(int i=0;i<=n; i++){
            for(int j =0;j<n-i;j++)
                System.out.printf("*");
            System.out.println();
        }

        for(int i=0;i<=n; i++){
            for(int j =0;j<n-i;j++)
                System.out.printf("*");
            System.out.println();
        }
    }
}

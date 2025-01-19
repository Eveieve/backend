package jungol.Loops3;

import java.util.Scanner;
// passed
public class Assess6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch = 'A';

        for(int i =0; i<n; i++){
            for(int j =0; j< n-i; j++) // i=0일때, 영문 3 , i=1 영문2, i= 2 영문 1
                System.out.printf(String.valueOf(ch++));

            for(int k =0; k<=i; k++){
                System.out.printf("A");
            }

            System.out.println();
        }

    }
}

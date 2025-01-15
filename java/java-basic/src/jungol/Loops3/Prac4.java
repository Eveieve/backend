package jungol.Loops3;

import java.util.Scanner;
// again! not passed

public class Prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 별대신에 공백먼저 찍기
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;i++){
                System.out.print(" ");
            }
            for(int star =1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        } // 역삼각형 공백 찍었음.
    }
}

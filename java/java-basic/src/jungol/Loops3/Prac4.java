package jungol.Loops3;

import java.util.Scanner;
// again! passed!!!

public class Prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 별대신에 공백먼저 찍기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { //1행 공백4개, 2행 공백3개..입력값은 5
                System.out.print("A"); //
            }
            //System.out.println();

            for (int j = 1; j <= i; j++) { //1행에서 별 한개, 2행에서 별2개...
                System.out.print("*");
            }
            System.out.println();
        }
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= i; j++) { //1행에서 별 한개, 2행에서 별2개...
//                    System.out.print("*");
//                }
//                System.out.println();
//
//            }
        }
    }



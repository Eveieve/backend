package jungol.Loops3;

import java.util.Scanner;
// again! not passed

public class Assess4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1 행 공백 0개, 2행 공백 1개 3행 공백2개 , 3번 반복
        for(int i =0; i<n; i++){
            // 1행 별3개, 2행 별2개, 3행 별1개
            System.out.printf("*");
        }
        System.out.println();
    }
}

package jungol.Loops3;

import java.util.Scanner;
// again! not passed

public class Assess4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1 행 공백 0개, 2행 공백 1개 3행 공백2개 , 3번 반복
        for (int i = 0; i < n; i++) { // n=3이라면 0부터 시작한다면 i<n이어야 3번 돈다.
            for (int j = 0; j < i; j++) // 0행 공백 0개, 1행 공백1개, 2행 공백 2개  ==>same as 'i',=> j<=i
                System.out.print(" ");
            // 행하나당 별도 있고 공백도 있으니 같은 레벨에서 for 문 2개 작성하기.
            for (int k = 0; k < n - i; k++) // 0행 별3개, 1행 별2개, 2행 별 1개
                System.out.print("*");

            System.out.println();
        }

    }
}

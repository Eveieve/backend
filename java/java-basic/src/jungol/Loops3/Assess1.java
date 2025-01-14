package jungol.Loops3;

import java.util.Scanner;
// again!!

public class Assess1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 초기화
        int n = sc.nextInt();

        int total = 0;
        int count = 0;


        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                count += 1;
                total += i;

            }

            if(total>=n)
                break;
        }
        System.out.printf("%d %d", count, total);
    }
}

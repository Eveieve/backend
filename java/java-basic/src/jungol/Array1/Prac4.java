package jungol.Array1;

import java.util.Scanner;
// passed
// 다시 보기
public class Prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for (int i = 0; i <= 99; i++) {
            int num = sc.nextInt();

            if (num == 0)
                break;

            arr[i] = num;
            if (i % 2 == 1 && i !=0 ) // i 가 2이변 3번째임.
                System.out.print(arr[i] + " ");

        }
    }
}

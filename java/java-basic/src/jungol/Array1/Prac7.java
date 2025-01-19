package jungol.Array1;

import java.util.Scanner;
//not passed
public class Prac7 {
    public static void main(String[] args) {

        // 4자리 이하 10개의 정수 입력 받기
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int evenMax = 0;

        for (int i = 0; i <= 9; i++) {
            int num = sc.nextInt();

            arr[i] = num;

            // 짝수
            if (arr[i] % 2 == 0) {
                int max = arr[i];
                if (arr[i] > max)
                    evenMax = arr[i];
            }
            System.out.println(evenMax);
        }
    }
}

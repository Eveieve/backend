package jungol.Array1;

import java.util.Scanner;

// again!!

public class Prac6 {
    public static void main(String[] args) {
        // loop element to see if the one before is greater than the one after

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];


        for (int i = 0; i <= 9; i++) {
            int num = sc.nextInt();
            arr[i] = num; // 배열에 넣기.

        }
        int greatest = arr[0];

        for (int i = 0; i <= 9; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }

        }
        System.out.println(greatest);
    }
}

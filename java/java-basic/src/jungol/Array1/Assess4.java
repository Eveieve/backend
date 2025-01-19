package jungol.Array1;

import java.util.Scanner;

public class Assess4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[100];
        int cnt = 0;

        while (cnt < 100) {

            int n = sc.nextInt();

            if (n != 0) {
                arr[cnt] = n;
                cnt++;
            } else if (n == 0)
                break;

        }
        for (int i = cnt; i >= 0; i--) {
            if(arr[i] != 0)
            System.out.print(arr[i] + " ");
        }
    }
}

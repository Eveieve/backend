package jungol.Array1;

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10 개 입력받기
        // create arr
        int[] arr = new int[10];

        for(int i =0; i<=9; i++){
            int num = sc.nextInt();
            arr[i] = num;


        }

        System.out.print(arr[2] + " " + arr[4] + " " + arr[9]);
    }
}

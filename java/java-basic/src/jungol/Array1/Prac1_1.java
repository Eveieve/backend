package jungol.Array1;

import java.util.Scanner;
// not passed
public class Prac1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
// 입력 받은 수들을 배열에 넣기

        int count = 0;

       // arr is the name of array
        while(count<=4) {
            int n = sc.nextInt();

            count++;
            int[] arr = new int[n];
            for(int i =0; i<n-1; i++){
                arr[i] = n;
                System.out.print(arr[i]);
            }

        } // 5개 정수 입력 받음.



    }
}

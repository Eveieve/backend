package jungol.Array1;

import java.util.Scanner;
// not passed
public class Assess7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 1; i < 10; i++) {
            int num = sc.nextInt();
            if (num >= 1 && num < 10000) {
                arr[i] = num;
            } else System.out.println(100);
        }

        int max = arr[0];
        int min = arr[0];

        for(int i =0; i<arr.length; i++){
            int num = arr[i];

            if(num<100){
                if(num > max)
                    max = num;
            } else {
                if(num < min)
                    min = num;

            }
        }
        System.out.println(max);
        System.out.println(min);
        // 배열 돌면서 100이상 숫자중에 가장 큰수 지목하기.
//        for (int i = 0; i < 10; i++) {
//            if (arr[i] < 100 && arr[i] >= max) {
//                max = arr[i];
//            } else if (arr[i] >= 100 && arr[i] <= min){ // arr[i]와 값이 100이상인 첨자를 비교해야 함.
//                min = arr[i];
//            }
//
//        }
//        System.out.printf("%d %d", max, min);
    }
}

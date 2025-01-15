package jungol.Array1;

import java.util.Scanner;
// passed
public class Prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 반별 평균 첨수 초기화하기
        double[] arr = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};

        //  출력할 것 = 반1 + 반2 /2 ;

        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        double avg = (arr[c1-1] + arr[c2-1]);
        System.out.println(avg);
    }
}

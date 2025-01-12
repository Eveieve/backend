package jungol.Control_Flow;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가장 큰 수 판별하기.
        int big =0;

        System.out.print("세 수를 입력하세요. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // 최댓값찾기
        if(num1 >= num2 && num1>= num3)
            big = num1;
        else if(num2 >= num1 && num2>= num3)
            big = num2;
//        else if(num3 >=num1 && num3>= num2)
        else
            big = num3;

        System.out.printf("입력받은 수 중 가장 큰 수는 %d 입니다.", big);
    }

}

package jungol.Loops1;

import java.util.Scanner;

// 다시 해보기

public class Assess5 {
    public static void main(String[] args) {

        // 3의 배우 아니면 아무것도 하지 않고
        // 3의 배수이면
            // 3으로 나눈 몫을 반복 출력
            // 1 입력 시 종료하기.

        Scanner sc = new Scanner(System.in);

        while(true) {
            int num = sc.nextInt();

            if(num%3==0) {
                System.out.println(num/3);
            }

            if(num == -1)
                break;
        }

    }
}

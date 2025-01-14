package jungol.Loops1;

import java.util.Scanner;

public class Eval4 {
    public static void main(String[] args) {
        // 계속 입력받기
        // 0 이면 break
        // 3의배수이면 카운팅 하지 않기
        // 5의 배수이면 카운팅 하지 않기
        // 개수 출력.

        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true) {
            int num = sc.nextInt();

            if (num % 3 != 0 && num % 5 != 0)
                count += 1;
            else if(num == 0)
                break;
        }
        System.out.println(count);
    }
}

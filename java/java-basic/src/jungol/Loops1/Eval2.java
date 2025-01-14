package jungol.Loops1;

import java.util.Scanner;
// 다시 해보기.

public class Eval2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddNum = 0;
        int evenNum = 0;
        while (true) {
            //계속 입력 받기
            int num = sc.nextInt();

            if (num != 0 && num % 2 == 0) // 0을 2로 나눠도 0 이기 때문에 0 이 아니어야 한다는 조건있어야.
                evenNum = evenNum + 1;
            else if (num % 2 == 1)
                oddNum = oddNum + 1;
            else if (num == 0){
                System.out.printf("odd : %d\n", oddNum);
                System.out.printf("even : %d", evenNum);
                break;
            }

        }
    }
}

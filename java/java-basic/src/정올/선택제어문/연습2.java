package 정올.선택제어문;

import java.util.Scanner;

public class 연습2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();
        int in2 = sc.nextInt();

        int bigger, smaller;
        if (in2 >= in) {
            bigger = in2;
            smaller = in;
        } else {
            bigger = in;
            smaller = in2;
        }
        System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다", bigger, smaller);
    }


}

package day03;

import java.util.Scanner;

public class Calculator {
//    public static void main(String[] args) {
//
//        calculator();
//    }

    static void adder(int num1, int num2) {
        int result = num1 + num2;
        System.out.printf("결과 : %d + %d = %d", num1, num2, result);
    }

    static void minus(int num1, int num2) {
        int result = num1 - num2;
        System.out.printf("결과 : %d - %d = %d", num1, num2, result);
    }

    static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.printf("결과 : %d * %d = %d", num1, num2, result);
    }

    static void div(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다. ");
        }else{
            double result = num1 / num2;
            System.out.printf("결과 : %d / %d = %.1f",num1,num2,result);
        }
    }

    void calculator() {
        Scanner input = new Scanner(System.in);
        String message = " ";
        do {
            System.out.println("========계산기 프로그램=========");
            //입력받는 로직 구현
            System.out.print("숫자, 연산자(+,-,*,/ 중), 숫자 순서대로 입력해 주세요: "); //
            int num1 = input.nextInt(); // 첫 숫자

            char operator = input.next().charAt(0);
//            String strOp = input.next();
//            System.out.println(strOp);
            System.out.println(operator); // print out operator

            int num2 = input.nextInt(); // 두번째 숫자
            System.out.println(num2);

            if (operator == '+') {
                adder(num1, num2);
            } else if (operator == '-') {
                minus(num1, num2);
            } else if (operator == '*') {
                multiply(num1, num2);
            } else if (operator == '/') {
                div(num1, num2);
            }
            System.out.println("종료하시려면 \"exit\" 입력하세요 ");
            message = input.next();
        } while (!message.equals("exit"));
    }

}

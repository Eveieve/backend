package jungol.Array1;

import java.util.Scanner;

public class Prac1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열을 사용하여 5개의 정수를 저장
        int[] numbers = new int[5];

        // 사용자로부터 5개의 정수 입력받기
        //System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // 입력받은 정수들 출력하기
        //System.out.println("입력한 정수들은:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]+ " ");
        }

        //sc.close(); // Scanner 객체 닫기
    }
}
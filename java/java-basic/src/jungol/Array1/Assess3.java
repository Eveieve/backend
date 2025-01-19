package jungol.Array1;

import java.util.Scanner;

public class Assess3 {
    public static void main(String[] args) {
        // Scanner 객체 생성하여 입력 받기
        Scanner sc = new Scanner(System.in);

        // 10개의 문자를 저장할 배열
        char[] characters = new char[10];

        // 10개의 문자 입력받기
        //System.out.println("10개의 문자를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            characters[i] = sc.next().charAt(0); // 하나의 문자만 입력받기
        }

        // 첫 번째, 네 번째, 일곱 번째 문자 출력
        // System.out.println("출력된 문자들:");
        System.out.print("%s %s %s");
        // System.out.println("네 번째 문자: " + characters[3]);
        // System.out.println("일곱 번째 문자: " + characters[6]);

        //sc.close(); // Scanner 객체 닫기
    }
}

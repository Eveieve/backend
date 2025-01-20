package jungol.Array1;

import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("YEAR = ");
            int year = sc.nextInt();
            System.out.print("MONTH = ");
            int month = sc.nextInt();


            if (month == 0) {
                //System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 월의 범위 확인
            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }

            // 월의 날 수 계산
            int days = 0;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31; // 31일인 달
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30; // 30일인 달
                    break;
                case 2:

                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29; // 윤년인 경우 2월은 29일
                    } else {
                        days = 28; // 평년인 경우 2월은 28일
                    }
                    break;
            }

            System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", days);
        }

        sc.close(); // Scanner 닫기
    }

}

package jungol.Loops1;

import java.util.Scanner;
//not passed

public class Assess6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반복 - 숫자 입력받고 수도 출력하기.
        String capital = " ";

        while (true) {
            System.out.printf("""
                1. Korea
                2. USA
                3. Japan
                4. China
                number? 
                """);
            int num = sc.nextInt();

            capital = (num == 1) ? "Seoul" : (num == 2) ? "Washington" : (num == 3) ? "Tokyo" : (num == 4) ? "Beijing" : "none";
            System.out.println(capital);

            if (capital.equals("none"))
                break;
        }


    }
}

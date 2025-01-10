package day03;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("x의 값 입력");
        String strX = input.nextLine(); // 사용자가 10을 입력하더라도 문자열로 인식함. 외부에서 들어오는 스트림들은 모두 문자열로 인식함.
        // int a = strX + 10 // ERROR
        // strX -> 숫자값으로 변경, int x에 저장한다.
        int x = Integer.parseInt(strX);

        System.out.println("Enter y: ");
        String strY = input.nextLine();
        int y = Integer.parseInt(strY); //int 로 변경. wrapper class 사용함.

        // 문자열은 연산이 되지 않기 때문에 알맞은 타입으로 캐스티기능을 제공하는 각 래퍼 클래스를 활용한다.
        // wrapper class 8가지.

    }
}

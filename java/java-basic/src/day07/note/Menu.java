package day07.note;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true) {
            System.out.println("당신의 이름을 입력하세요 :");
            String name = sc.nextLine();

            System.out.println("연락처를 입력하세요");
            String phone = sc.nextLine();

            System.out.println("");
            System.out.println("""
                1. 고객 정보 확인하기
                2. 장바구니..
                """);



        }


    }
}

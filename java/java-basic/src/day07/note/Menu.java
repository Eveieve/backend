package day07.note;

import java.util.Scanner;
// Jan 17th

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("당신의 이름을 입력하세요: ");
            String name = sc.nextLine();
            System.out.print("연락처를 입력하세요: ");
            String phone = sc.nextLine();
            // 이거왜 입력안되는거지

            welcome();

            showMenu();

            System.out.print("메뉴 번호를 선택해주세요: ");
            int menuNum = sc.nextInt();
            sc.nextLine(); //nextInt 가 남긴 개행문자 소비하기 위해.

            switch(menuNum){
                case 1:
                    System.out.println("현재 고객 정보 : ");
                    System.out.println("이름 " + name + "   " + "연락처" + phone);
                    break;
                case 2:
                    System.out.println("장바구니 상품 목록 보여드립니다. ");
                case 7:
                    System.out.println("영수증 보여드립니다");
                case 8:
                    System.out.println("시스템을 종료합니다.");
                    return; // 종료
                default:
                    System.out.println("잘못된 입력입니다.");
            }

            welcome();
        }
    }

    private static void welcome() {
        System.out.println("**********************************");
        System.out.println("Welcome to Shopping Mall");
        System.out.println("Welcome to Book Market");
        System.out.println("**********************************");
    }
    private static void showMenu() {
        System.out.println("""
                    1. 고객 정보 확인하기       4. 바구니에 항목추가하기
                    2. 장바구니..              5. 장바구니의 항목수량 줄이기
                    7. 영수증 표시하기          8. 종료
                    """);
    }
}
// 이 문제가 발생하는 이유는 Scanner 클래스에서 nextInt()를 호출한 뒤 바로 nextLine()을 호출할 때 발생하는 공통적인 문제입니다. nextInt() 메서드는 정수를 읽을 때 개행 문자(\n)를 소비하지 않으므로, 뒤이어 호출된 nextLine()이 이 개행 문자를 읽어서 빈 입력처럼 동작하게 됩니다.
//
//해결 방법
//문제를 해결하려면, nextInt() 호출 후에 남은 개행 문자를 소비하도록 sc.nextLine()을 추가로 호출해야 합니다.
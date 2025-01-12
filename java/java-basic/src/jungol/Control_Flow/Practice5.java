package jungol.Control_Flow;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주사위를 두 번 던진 결과를 입력하세요. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String say = " ";

        if(num1 >= 4 && num2 >=4)
            say = "이겼습니다.";
        else if(num1 >= 4 || num2 >=4 )
            say = "비겼습니다.";
        else if(num1 < 4 && num2 < 4)
            say = "졌습니다.";

        System.out.print(say);
    }


}

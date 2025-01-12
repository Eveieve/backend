package jungol.Control_Flow;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                1. 삽입
                2. 수정
                3. 삭제
                숫자를 선택하세요.
                """);

        int in = sc.nextInt();
        String say = " ";

        if(in == 1)
            say = "삽입을 선택하셨습니다.";
        else if(in == 2)
            say = "수정을 선택하셨습니다.";
        else if(in == 3)
            say = "삭제를 선택하셨습니다.";

        System.out.println(say);

    }
}

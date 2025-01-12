package jungol.Control_Flow;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요. ");
        String in = sc.next();
        int num = Integer.parseInt(in);

        if(num >= 80) {
            System.out.print("축하합니다. 합격입니다");
        } else
            System.out.print("불합격입니다.");
    }
}

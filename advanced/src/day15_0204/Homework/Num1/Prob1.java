package day15_0204.Homework.Num1;

import java.util.Scanner;
//BufferedReader(new InputStreamReader(System.in)) 사용하셔도 됩니다.

public class Prob1 {
    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
        String input = scan.nextLine();
        try {
            convert(input);
        } catch (IllegalArgumentException e) {
            //throw new RuntimeException(e); 여기서 할 필요 없음. 그럼 언제 해?
//            if(input == null) {
//                System.out.println("예외 발생. 문자열 입력하지 않고 Enter 누름.");
//            } // 근데 인풋이 그냥 엔터친건지 어떻게 알아? IllegalArgumentException 자체가 인풋 없이 엔터칠때 던져지는건가?
            System.out.println("예외 발생. 문자열 입력하지 않고 Enter 누름.");
        }

        int result = 0; // 이건 뭐야?

    }
    // throws IllegalArgumentException~ 으로 작성하면 호출하는 곳에서 꼭! 예외처리 해야함.
    private static int convert(String str) throws IllegalArgumentException{
        // if str is null
        // if length is 0,
        //if(str == null)
        System.out.println("반환된 숫자는 " + Integer.parseInt(str)+ " 입니다.");
        return Integer.parseInt(str);
    }
}

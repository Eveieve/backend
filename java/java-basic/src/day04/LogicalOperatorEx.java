package day04;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        // 논리연산자 (&& 논리곱, || 논리합, ^ 배타적 논리합, ! NOT

        int charCode = 'A'; // 65. 65~90까지가 A부터 Z까지 범위임.

        //charCode 변수에 들어간 값이 대문자/소문자인지 검증하고 싶다.
        if (65 <= charCode && charCode <= 90){
            System.out.println("That is a uppercase letter.");
        }

        charCode = 'a';
        if(charCode >= 'a' && charCode <= 'z') // 아스키 코드(숫자)로 자동 변환 해줌.
            System.out.println("That is a lowercase letter");


        charCode = 48; // char 이지만 정수대입
        if(charCode >= 48 && charCode <= 57) // 아스키 코드(숫자)로 자동 변환 해줌. Implicit casting
            System.out.println("That is a lowercase letter");

        int value =6;
        if(value%2 == 0)
            System.out.println("even number");
        else
            System.out.println("odd number");
    }
}

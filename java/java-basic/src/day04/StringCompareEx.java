package day04;

public class StringCompareEx {
    public static void main(String[] args) {
        // 문자비교

        char ch1 = 'A'; // 65
        char ch2 = 'B'; //6

       boolean result1 = (ch1 < ch2); // always true
        System.out.println(result1);

        //실수 비교

       int n5 = 1;
       double n6 = 1.0;
       result1 = n5 == n6;
        System.out.println(result1); // false. 1 과 1.0은 같지 않음.

        float n7 = 0.1f;
        n6 = 0.1; // double value.
        result1 = n5 == n6; // false
        System.out.println(result1);
        result1 = n5 == (float)n6; // false
        System.out.println(result1);

        // 정밀도 차이때문에 (부동소수점 방식) 실수 타입은 0.1을 정확히 표현하기 어려워서 다른 수로 본다. 0.1f == 0
    }
}

package day03;

public class StringConcatEx {
    public static void main(String[] args) {

        int result = 10 + 2 + 8; //20 은 자바 컴파일러가 미리 result에 저장함.
        System.out.println("result: " + result);

        // 결합연산
        String result1 = 10 + 2 + "8"; // 문자열 8.
        System.out.println("result1: " + result1); // 문자열로 리턴됨. "128"
        // 12가 문자열 8과 만나, 연산되지 않고 문자열로 리턴됨.

        String result2 = 10 + "2" + 8;
        System.out.println(result2); // "1028"

        System.out.println("10" + 2 + 8); // "1028" 산술 연산자 + 가 아니라 연결 연산자로 사용됨.

        System.out.println("10" + (2+8)); // "1010". 10이 계산되고 문자열을 만남.
    }
}

package day08_0117;

// StringTokenizer 클래스
// 구분자를 기준으로 토큰이라는 여러개의 문자열로 잘라낼때 사용

import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        String str = "Welcome to Java Programming";

        StringTokenizer st = new StringTokenizer(str); // str의 첫번째 인덱스 주소값을 저장해놨을거임

        System.out.println("전체 토큰 수: " +  st.countTokens()); // 분철한 전체 토큰수를 알고 싶을때

        // Enumeration 타입..
        // 토크나이저는 자기안에 인덱스 보관중. 반환을 객체로 함. split 은 문자열로 .
        while(st.hasMoreTokens()){ // 토큰이 있으면 ~
            System.out.println(st.nextToken());
        }
    }
}

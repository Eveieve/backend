package day08_0117;

public class StringBufferEx {
    public static void main(String[] args) {
        //StringBuffer 의 기본 사이즈는 16개의 문자를 저장할 수 있다.
        // StringBuffer(int capacity) 생성자는 ~ (검색해 읽기)

        StringBuffer sb = new StringBuffer();
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        String result = sb.toString();
        System.out.println(result);

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb.capacity()); // StringBuffer 의 배열 용량 크기 반환
        System.out.println(sb.capacity());
        sb1.append("11111111111111");
        result = sb1.toString();
        System.out.println(result);

        String str = "abcdefg";
        StringBuffer sb2 = new StringBuffer(str); // String 을 StringBuffer 클래스로 형변환
        System.out.println("처음 상태 : "+ sb2);
        // StringBuffer -> String
        System.out.println(sb2.toString());
        System.out.println("문자열 추출: " + sb2.substring(2) ); // cdefg . index2 till the end.
        System.out.println("문자열 추출: " + sb2.substring(2, 4) ); // cd. index 4 is not included.
        System.out.println("문자열 추가: " + sb2.insert(7, "hij")); // abcdegfhij !!! offset 7 인거 체크하기.
        System.out.println("문자열 삭제 " + sb2.delete(3,6));
        System.out.println("문자열 추가하기: " + sb2.append("hhhh"));
        System.out.println("문자열 길이: " + sb2.length());
        System.out.println("문자열 거꾸로: " + sb2.reverse());

        // 최종 데이터가 다 조작되어 완성 되면 String 으로 마무리하기. Q. Why?
        System.out.println(sb2.toString()); //

        /// ///////////////////
        String star = "*";
        for(int i=1; i<10; i++)
            star += "*";
        System.out.println(star);
        // Using StringBuffer
        StringBuffer sb3 = new StringBuffer("*");
        sb3.append("********");
        System.out.println(sb3);
        System.out.println(sb3.toString());
        /// ///////////////////
        // Using StringBuilder
        String str3 = "hello" + "world";
        String str4 = new StringBuilder("hello").append("world").toString(); // chianing -메모리 절약 가능. 그럼 얘는 메모리에 어떻게 만들어지지?

        /// //////////////
        StringBuilder sb4 = new StringBuilder();
        for(int i =0; i<10000; i++){
            sb4.append(i);
        }
        final String number = sb4.toString(); // Q. final 은 왜 쓰느냐?
        System.out.println(number);
        // 문자열 연산이 많을 경우, StringBuilder 객체로 문자열을 생성해 다루는 것이 성능을 높일 수 있음.
        // Q. Builder vs Buffer?
        //

    }
}

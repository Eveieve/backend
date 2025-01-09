package day02;

public class StringEx {
    public static void main(String[] args) {
        // '' is char type => int type
        // "" is String type. 유니코드로 변환되지 않는다.
        char v1 = 'A';
        //char v2 = "장군님"; 오류!!!!
        String v2 = "홍장군";

        String v3 = new String("홍길당");
        String v4 = "홍장군";

        System.out.printf("%c, %s, %s,", v1, v2, v3);
        System.out.println(v3.hashCode());
        // char은 해시코드 자체가 없음 스택에 만들어지기 때문.
        System.out.println(v4.hashCode());
        // 재할당 하지않고 재활용!!! ???????


    }
}

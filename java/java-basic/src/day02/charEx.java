package day02;

public class charEx {
    public static void main(String[] args) {
        char c1 = 'A'; // 문자 리터럴 저장.
        char c2 = 65; // 유니코드로 저장됨.
        char c3 = '가';
        char c4 = 44032; // 유니코드로 저장된.

        char c = ' '; //char 변수에 어떤 문자도 대입하지 않고 초기화할 목적으로 '' => 컴파일 에러.
        // 반드시 초기화. 공백을 포함하면 됨.
        char d = 32; //유니코드로 공백임.
        System.out.printf("%c %c %c %c", c1, c2, c3, c4);


    }
}

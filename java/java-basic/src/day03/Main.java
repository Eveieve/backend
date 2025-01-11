package day03;

public class Main {
    public static void main(String[] args) {
        String str = "I'm \"java\""; // escape 문자 :문자열 내부에 역슬래쉬가 붙은 문자
        System.out.println(str);

        String str2 = "I \tlike\t \\apples\\"; // \t 출력 시 탭만큼 띄움
        System.out.println(str2);
    }
}

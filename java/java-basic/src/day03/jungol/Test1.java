package day03.jungol;

public class Test1 {
    public static void main(String[] args) {
        String str = "This prints the result";
        int a = 10;
        int b = 5;
        int result = a+ b;
        String str1 = "My birthday is March 25th";
        System.out.printf("%s%n%d + %d = %d%n%s", str, a, b, result, str1);

        // Java13 부터 텍스트 블럭 문법을 제공함.
        String str2 = """
                subject score
                =============
                korean  90
                english 100
                computer 80
                """;
        System.out.println(str2);
    }
}

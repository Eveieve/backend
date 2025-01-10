package day03;

public class PromitiveAndStringEx {
    public static void main(String[] args) {
        ////// String -> Primitive types
        int value1 = Integer.parseInt("10"); // int 4바이트 짜리로 변경 가능.

        //double value2 = "3.14";
        double value2 = Double.parseDouble("3.14"); //문자열을 double로.

        // boolean value3 = "true";
        boolean value3 = Boolean.parseBoolean("true");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3); // cntrl alt l 자동정렬

        //////// Integer -> String types
        String str1 = String.valueOf(10); // 다형성, 오버로딩 기법으로, argument 에 따라 다른 기능을 제공합.
        String str2 = String.valueOf(3.14); // float -> string
        String str3 = String.valueOf(true); // boolean -> string


    }
}

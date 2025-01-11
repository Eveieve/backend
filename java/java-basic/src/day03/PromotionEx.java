package day03;

public class PromotionEx {
    public static void main(String[] args) {

        char charValue = '가'; // 44032 unicode
        int intValue = charValue; // 자동 promotion 됨. 유니코드로 변환되기 때문에.
        System.out.println(intValue);

        char charValue1 = (char)intValue;
        System.out.println("int type is casted: " + charValue1);

        intValue = 100;
        long longValue = intValue;
        System.out.println("int type can be put inside long type: " + longValue);

        float floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("float type put inside double type: " + doubleValue);
        // float 과 doulble 은 메모리 사이즈가 다름. 출력은 똑같이 되지만

        System.out.println("true plus empty string is:" + true + "");
        //boolean check = true + "";
        String check2 = true + ""; // true turns into String type?????
        System.out.println();

//        int intValue2 = 500;
//        byte byteValue2 = intValue2; // Cast expression to 'byte'
//        System.out.println(byteValue2); // incompatible types: possible lossy conversion from int to byte

        int intValue2 = 128;
        byte byteValue2 = (byte)intValue2;
        System.out.println(byteValue2); // -128

        // 강제 캐스팅 목적: 원래 값유지하면서 타입 바꾸기 위해

        long longValue3 = 300;
        int intValue3 = (int)longValue3;
        System.out.println(intValue3); // 300

        // int -> char
        // int 타입은 char 타입으로 자동변환되지 않음! (char) 강제캐스팅 해줘야 함.
        // 주의할 점: char 타입 범위 0~65535 사이의 값만 원래 값으로 유지된다.
        int intValue4 = 97;
        char charValue4 = (char) intValue4;
        System.out.println(intValue4 + " " + charValue4); // 97 a

        // 실수 -> 정수의 강제 캐스팅은 소수점 이하 부분은 버려지고, 정수 부분만 저장한다.
        double doubleValue5 = 3.14;
        int intValue5 = (int)doubleValue5;
        System.out.println(intValue5); // 3

        byte result = 10 + 20; // 지금 int 타입인디
        //30은 바이트에서 수용할 수 있음.
        // 자바 컴파일러가 컴파일 단계에서, 변동 사항 없음. 리터럴이기 때문에 (30). 그래서 컴파일할때 연산함. 30미리 만들어놓고.
        // 이는 실행시 덧셈 연산에 대한........????/

    }

}

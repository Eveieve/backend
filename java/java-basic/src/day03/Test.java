package day03;

public class Test {
    public static void main(String[] args) {

        byte bb = 10;
        int cc = bb;
        long dd = cc;
        float ff = dd;
        double doub = ff;
        System.out.printf("%f", doub);

        char charValue ='A';
        int intValue = charValue;

        System.out.println(charValue);
        System.out.println(intValue); // int 에 담음. 가능.

//        byte byteValue = 65;
//        char charValue2 = byteValue; // incompatible types: possible lossy conversion from byte to char. !! Compile Error

    }
}

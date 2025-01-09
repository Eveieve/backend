package day02;

public class IntegerLiteralEx {
    public static void main(String[] args) {
        // 10진수 11을 이진수로 저장하려고 한다. 어떻게 표현하면 될까?
        int x = 0b1011; // binary 1011 (can omit zeros at the start)
        int y = 0B10111;
        System.out.println(x);
        System.out.println(y);

        //8진법. 0부터 7까지 숫자.
        //
        int a = 013;
        System.out.println(a);

        // 16진법. 0x로 시작. 0~9는 그대로. 10-A, 11-B, 12-C, 13-D, 14-E 15-F
        int z = 0xB;

        // 11 => 2진수
        // 134 8진수
        // 365 10진수
        // 179 16진수

        int var1 = 0b1011;

        int var2 = 0206; // 8진수는 앞에 0붙이기.

        int var3 = 365;

        int var4 = 0xB3;


        System.out.printf("%d %d %d %d", var1, var2, var3, var4);
    }


}

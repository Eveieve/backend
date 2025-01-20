package day09_0120;

public class Example02 {
    public static void main(String[] args) {
        print();
        print("this prints message");
        print(2,3);

    }
    public static void print() { // 메인에서 호출해 쓸거니까 static.
        System.out.println("static method");
        System.out.println(5 + 6);
    };

    public static void print(String msg) {
        System.out.println(msg);
    };

    public static void print(int num1, int num2) {
        System.out.println(num1 + num2);
    };
}

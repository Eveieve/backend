package java_book.Loops;

// 6.3 do while 문
public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i + " 번째 반복이다.");
            i++;
        }while(i<=5);

        System.out.println("반복끝. ");
    }
}

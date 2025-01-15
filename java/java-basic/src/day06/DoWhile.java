package day06;
import java.util.Scanner;


public class DoWhile {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");

        Scanner in = new Scanner(System.in);
        String inputString;

        do{
            System.out.println(">");
            inputString = in.nextLine();
            System.out.println(inputString);
        } while(!inputString.equals("exit"));

        System.out.println();
        System.out.println("exit");
    }
}

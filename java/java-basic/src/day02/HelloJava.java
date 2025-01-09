package day02;
// java, util package
import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {

        System.out.println("Hello Java");
        System.out.println("Enter your name: ");

        //표준 입력기 만들기 , alt shift enter 자동 임포트
        // final class : 상속금지, 변형 불가. 있는 그대로 쓰기.
        // input 은 멤버변수/객체변수.
        // new 는 메모리에 올려주는, 새로 생성하는 명령어. 기본틀은 있으니 메모리에 올려줘!
        // 클래스 이름으로 call 되는 메서드는 생성자, constructor
        // 순서대로 들어오는 데이터를 System.in 으로 받기
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); // 한줄을 읽어서 (엔터칠때까지) name 에 옮겨줘.
        System.out.println("Hello " + name);

        callName();
        String fetchedFood = callStringName();
        System.out.println(fetchedFood);
       fetchedFood =  fetchedFood + "yummy";

       callStringParam(fetchedFood);
    }

    public static void callName() {
        System.out.println("Call my name please");
    }
    // shift f8 to return from debug mode
    // 리턴값이 사용되지 않으면 노란줄로 알려줌. 콜 은 되었음.
    public static String callStringName() {
        return "ramen";
    }

    // static 메서드들은 static 끼리만 소통 가능. 메모리 영역 - method area에 있음.
    // static 은 static 들끼리만 콜 할 수 있음.
    public static void callStringParam(String food) {
        System.out.println(food);
    }
}

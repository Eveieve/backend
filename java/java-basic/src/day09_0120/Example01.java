package day09_0120;

// 1.

public class Example01 {
    public static void main(String[] args) {
        // static 은 static 끼리만 통신한다.
        // 메인에서는 static 만 처리해줌.
        int num = 10;  //입력 받기

        String numKind = determineNum(num); // 변수를 할당하기. 값이 바뀌면서 재활용할 수 있기. 알아서 혼자 돌게끔 만드려면 변수를 인자로.
        System.out.println(numKind);

    }

    public static String determineNum(int num) {
        // 메인에서 보내주는 인자값을 받아 출력하자.

        String str = " ";

        if (num % 2 == 0)
            str = "even number";
        else
            str = "odd number";

        return str;
    }


}

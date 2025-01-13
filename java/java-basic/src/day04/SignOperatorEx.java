package day04;

public class SignOperatorEx {
    public static void main(String[] args) {
        //2. 증감 연산자
//        byte b = 100;
//
//        System.out.println(-b); // 원본 데이터 100은 변경되지 않음
//        System.out.println((-b)); // 원본 데이터 100은 변경되지 않음
//
//        System.out.println(-(-b)); // 원본 데이터 100은 변경되지 않음


        //2. 증감 연산자 (++, --), 단일항 연산자.

        // 변수 단독으로 증강, 감소 연산자 사용할 경우 (앞, 뒤) 결과는 동일하다.

        int x = 1;
        int y = 1;

        int result1 = ++x; // 선증가 , x = x+1;
        System.out.println(result1);
        int result2 = x++; //후증가, 나중에 x를 증가시키기. 현재 x는 2.
        System.out.println(result2);

        System.out.println(x); // x는 3

    }
}

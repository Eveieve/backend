package jungol.Array;

public class Playground {
    public static void main(String[] args) {
        int[] test; // 배열 변수 선언
        test = new int[5]; // 배열 요소 생성

        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;

        for(int i = 0; i<5; i++) {
            System.out.println((i+1) + "번째 사람의 점수는 " + test[i] + "입니다.") ;
        }
    }
}

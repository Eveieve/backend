package java_book;

public class Array2 {
    public static void main(String[] args) {
        int[] test = {80,27, 80, 67, 10, 13};

//        for(int i=0;i<5; i++) {
//            System.out.println((i+1) + "번째 사람의 점수는 " + test[i] + "이다.");
//        }
//        System.out.println("시험 총 응시자 수는 " + test.length + "명이다. ");
//        // length 는 배열 요소(상자 개수)의 개수를 출력한다.

        for(int i=0;i<test.length; i++) {
            System.out.println((i+1) + "번째 사람의 점수는 " + test[i] + "이다.");
        }
        System.out.println("시험 총 응시자 수는 " + test.length + "명이다. ");
    }
}

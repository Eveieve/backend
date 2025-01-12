package java_book.Loops;

// 6.4 문장의 중첩
public class NestingFor {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i는 " + i + ", j는 " + j);
            }
        }
        // 바깥 반복문이 1번 실행되면 안쪽 반복문은 3번 실행된다.


        // <7.7 다차원 배열 >
        //int[][] test; // 2차원 배열 선언.
        //test = new int[2][5]; // 배열 생성.


        int[][] test = {{80, 50, 22, 50, 75}, {90,55,44,67,32,68}}; // 2차원 배열을 초기화.

        // 길이가 일정하지 않은 다차원 배열 (비대칭 배열)
        int[][] test2 = {{80, 50, 22, 50}, {90,55,44,67,32}, {33, 75,63}}; // 2차원 배열을 초기화.


    }




}

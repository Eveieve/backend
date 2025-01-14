package day05;

public class NestedFor {
    public static void main(String[] args) {
        for(int i = 1; i<=2;i++){ // 행
            for(int j =1; j<=2; j++){// 행에 대한 열
                System.out.print("(" + i + ", " + j + ")\n");
            }
        }

        // 2 단
        for (int dan =2 ; dan <=9 ; dan++){ // 9단가지 출력
            // 2 x 1, 2x2, 2x3, 2x4....2x9 까지 출력하기
            // 3x1, 3x2, 3x3... 출력하기..
            for(int i =1; i<=9; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, dan*i);
            }
        }
    }
}

package jungol.Loops3;

import java.util.Scanner;
// 다시해보기
public class Assess3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // 크게 n번 돌아야 하니까
            for (int j = n; j >=i ; j--) {  // i =1, j =3, /i = 2, j = 2, /
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        for(int i =1; i<= n; i++){
            for(int j = 1; j<=i; j++){ // j<=i because.. i 1일때 j로 와서 한번 돌고, i가 2일때 j루프로 와서 두번돌고 , i가 3일때 (세번째 행일때)j루프로 와서 세번돌기
                System.out.printf("*"); // 1행에서 1번찍고
            }
            System.out.println();
        }
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(); // 줄바꿈
//        }
    }
}

//This code is not suitable for an inverted triangle because:
//
//The inner loop (for (int j = n; j >= 1; j--)) always prints n stars, regardless of the outer loop's current value (i).
//An inverted triangle requires the number of stars printed to decrease with each row, but your inner loop is fixed to run n times every row.
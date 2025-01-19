package jungol.Loops3;

import java.util.Scanner;
// not passed
public class Prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j =0; j<=i;j++){ //i =4 일때, 0, 1,2, 3,4,로 다섯번 돌 수 있음 <=로 해야.

                System.out.print(++cnt + " ");
            }
            for(int k =0; k<n-i -1 ; k++){ // i =4 일때, (마지막줄), k < 5-i, j<=4 로 공백없이 (k=0, k<n, k++)로 할 수 있다.
                System.out.print("A");
            }
            System.out.println();
        }


        
    }
}

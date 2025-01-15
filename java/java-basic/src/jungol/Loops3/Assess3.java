package jungol.Loops3;

import java.util.Scanner;
// 혼자 풀었음!
public class Assess3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) { // 만약 n=4라면, 첫번째 줄에 4개가 찍힐 수 있도록. 두번째줄에는 3개. 두번째 줄일때 i가2일것임.
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + 1; j++) { //1번째 줄에 별(열)이한개, 2번째 줄에 별이2개, 찍어져야 하니까 j<=i(2번 돌아야 하니까 1부터 2까지 두번)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// for (int j = 1; j <= n - i + 1; j++) 이거나 => n=4 일때 4개찍을 수 있어야 함. i가 1부터 시작되니까 4-1하면 세번밖에 출력되지 않기 때문에 +1 해주기.
// for (int j = 0; j <= n - i ; j++) 로하면 된다.


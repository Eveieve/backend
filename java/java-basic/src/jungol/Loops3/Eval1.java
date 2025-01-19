package jungol.Loops3;

import java.util.Scanner;
// not passed
public class Eval1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 1;
        int sum = 0;
        int avg;

        while (cnt <= 20) {
            int n = sc.nextInt();
            sum += n;

            if (n == 0)
                break;
            cnt++;
        }
        avg =  sum/cnt;

        System.out.printf("%d %d", sum, avg);
    }
}

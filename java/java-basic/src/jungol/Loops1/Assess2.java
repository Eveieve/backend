package jungol.Loops1;

import java.util.Scanner;

public class Assess2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= num) {
            //sum = sum +i;
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}

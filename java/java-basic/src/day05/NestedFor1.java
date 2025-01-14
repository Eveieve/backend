package day05;

import java.util.Scanner;
// again!
public class NestedFor1 {
    public static void main(String[] args) {
        // 5 row, 9col 표
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();

        for(int i = 0; i<len; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<(2*len)-1-(i*2); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

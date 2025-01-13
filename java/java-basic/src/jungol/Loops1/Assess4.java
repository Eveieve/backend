package jungol.Loops1;

import java.util.Scanner;

public class Assess4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        double loops = 0;

        // 계속 입력하기.
        while(true){
            int num = sc.nextInt();

            sum += num;
            loops++;

            // 100 입력되면 루프 그만.
            if(num>=100)
                break;
        }
        System.out.println(sum);
        avg = sum/loops;
        double rounded = Math.round(avg * 10.0) / 10.0; // why 100.0 instead of 100?
        System.out.println(rounded);
    }
}

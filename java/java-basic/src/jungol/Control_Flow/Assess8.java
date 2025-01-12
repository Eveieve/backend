package jungol.Control_Flow;

import java.util.Scanner;

public class Assess8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double in = sc.nextDouble();

        String say = " ";

        if (in > 4.5)
            System.out.println("Invalid input");
        else {
            // convert to integer
            int range = (int) (in * 10);
            switch (range / 10) {
                case 4:
                    say = "scholarship";
                    break;
                case 3:
                    say = "next semester";
                    break;
                case 2:
                    say = "seasonal semester";
                    break;
                default:
                    say = "retake";
                    break;
            }
            System.out.println(say);
        }


    }
}

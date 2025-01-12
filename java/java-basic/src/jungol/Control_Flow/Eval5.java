package jungol.Control_Flow;

import java.util.Scanner;

public class Eval5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = 0;

        if(month>12)
            System.out.println("Wrong output");
        else if (month == 1 || month == 3|| month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
            day = 31;
        else if (month == 2)
            day = 28;
        else if (month == 4 || month == 6 || month == 9 ||  month == 11)
            day = 30;

        System.out.println(day);

    }
}

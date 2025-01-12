package jungol.Control_Flow;

import java.util.Scanner;

public class Eval4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number? ");
//        String str = sc.next();
//        int num = Integer.parseInt(str);
        int num = sc.nextInt();

        String say = " ";

        if(num ==1)
            say = "dog";
        else if (num ==2)
            say = "cat";
        else if (num ==3)
            say = "chick";
        else
            say = "I don't know.";

        System.out.println(say);

    }
}

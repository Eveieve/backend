package jungol.Control_Flow;

import java.util.Scanner;

public class Assess6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input sex and age
        String strsex = sc.next();
        char sex = strsex.charAt(0);
        int age = sc.nextInt();


        String say = " ";

        if(age >= 18 && sex == 'M')
            say = "MAN";
        else if(age>=18 && sex == 'F')
            say = "WOMAN";
        else if(age<18 && sex == 'M')
            say = "BOY";
        else if(age<18 && sex == 'F')
            say = "GIRL";

        System.out.println(say);

    }
}

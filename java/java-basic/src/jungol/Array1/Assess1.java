package jungol.Array1;

import java.util.Scanner;

public class Assess1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char[] arr = new char[10];

        for(int i=0; i<10 ; i++){
            String str = sc.next();
            char ch = str.charAt(0);
            arr[i] = ch;
            System.out.print(arr[i]);
        }
        sc.close();
    }
}

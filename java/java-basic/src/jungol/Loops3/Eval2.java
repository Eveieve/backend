package jungol.Loops3;

import java.util.Scanner;
// not passed
public class Eval2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num >=1 && num<= 100){
           for(int i =1; i<= 10; i++){
               if( i == 10){
                   System.out.print(num * i );
                   break;
               }
               System.out.print(num * i + " ");

           }
        }
    }
}

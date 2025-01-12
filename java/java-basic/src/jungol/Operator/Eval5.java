package jungol.Operator;

import java.util.Scanner;

public class Eval5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int 민수_키 = sc.nextInt();
        int 민수_몸 = sc.nextInt();

        int 가영_키 = sc.nextInt();
        int 가영_몸= sc.nextInt();

        if(민수_키>= 가영_키 && 민수_몸>=가영_몸)
            System.out.println(1);
        else
            System.out.println(0);
    }
}

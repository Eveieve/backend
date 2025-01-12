package jungol.Control_Flow;
import java.util.Scanner;

public class Assess2 {
    public static void main(String[] args) {

        int height;
        int weight;
        int obesity;

        Scanner sc = new Scanner(System.in);

        height = sc.nextInt();
        weight = sc.nextInt();

        obesity = weight + 100 - height;

        System.out.println(obesity);

        if(obesity>0)
            System.out.println("Obesity");
    }
}

package jungol.Control_Flow;

import java.util.Scanner;

public class Assess7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char grade = str.charAt(0);

        String say = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Good";
            case 'C' -> "Usually";
            case 'D' -> "Effort";
            case 'F' -> "Failure";
            default -> "error";
        };

        System.out.println(say);
    }
}

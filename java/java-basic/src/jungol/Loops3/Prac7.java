package jungol.Loops3;

public class Prac7 {
    public static void main(String[] args) {

        char ch = 'a';
        int cnt = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) { // j<=1 b/c letter needs to be at least once for first row when i =0
                System.out.print(ch++ + " ");
            }
            for (int k = 0; k < 4 - i; k++) {
                System.out.print(cnt++ +" ");
            }
            System.out.println();

        }
    }
}

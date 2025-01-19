package jungol.Loops3;

// again!

public class Prac5_1 {
    public static void main(String[] args) {


        // 5row, 9col

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5- i ; j++) { // 4 spaces for row 1, 3 spaces for row 2 , 2spaces for row 3, 1space for row 4
                System.out.print(" ");// write 4 spaces first for 0 row
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");// 1star for 1 row , 3stars for row 2, 5 stars for row 3, 7 stars for row 4
            }

            System.out.println();
        }
    }
}

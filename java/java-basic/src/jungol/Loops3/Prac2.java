package jungol.Loops3;

// again!
public class Prac2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) { // need 3 rows
            for (int j = 1; j <= i; j++) { // for 1st row, need 1 col, for 2nd row, need 2 cols, for 3rd row, need 3 cols(stars)
                System.out.print("*");
            }
            System.out.println(); // next line after cols are printed.
        }
    }
}

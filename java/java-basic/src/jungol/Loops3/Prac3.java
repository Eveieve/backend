package jungol.Loops3;

// passed - try again

public class Prac3 {
    public static void main(String[] args) {

        // for each row, need row amount of cols
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4 - i; j++) { // for 1st row, need three stars, for 2nd row, need 2 stars, for 3rd row, need 1 star
                System.out.print("*"); // j <= 4 - i; => 첫번째 row에 3개의 star(column)찍을 수 있게 3이 아니라 4에서 빼기
            }
            System.out.println();
        }
    }
}

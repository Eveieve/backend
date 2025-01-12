package jungol.Control_Flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int num = Integer.parseInt(input);

        if (num > 10) {
            System.out.println("10보다 큰 수를 입력하셨습니다.");
        }
    }
}

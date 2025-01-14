package jungol.Loops1;

// 다시해보기
import java.text.DecimalFormat;
import java.util.Scanner;

public class Eval3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        float avg = 0.0f;
        int nums = 0;

         // double 의 default는? 0.0

        DecimalFormat df = new DecimalFormat("#.#");

        while (true) {
            int num = sc.nextInt();
            if (num < 0 || num > 100) { // 범위 벗어나면 그만하고
                break;
            }
            sum = sum + num;
            nums = nums + 1;
            avg = (float) sum/nums;

        }
        System.out.printf("sum : %d\n", sum);
                System.out.printf("avg : %f", Math.round(avg * 10) / 10.0); // 소수점 첫째자리까지 반올림.
//        System.out.printf("avg : %s", df.format(avg));
}
}
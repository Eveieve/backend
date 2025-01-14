package jungol.Loops1;

// 다시해보기
import java.text.DecimalFormat;
import java.util.Scanner;

public class Eval3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0.0f;
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
            avg = (double) sum/nums;

        }

        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f", avg); // 첫째자리 까지 반올림하고 싶으면 .1f, 둘째자리까지 원하면 .2f


        //System.out.printf("avg : %f", Math.round(avg * 100.0) / 100.0); // 소수점 첫째자리까지 반올림.
//        System.out.printf("avg : %s", df.format(avg));
}
}
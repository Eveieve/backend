package day06;
// random (난수)
// 자바 : 1.Random 클래스

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random random = new Random();

        int n1 = random.nextInt(4); // 4 미만의 랜덤 정수 리턴한다.
        System.out.println(n1);

        for(int i=1;i<=3;i++){
            int n2 = random.nextInt(4);
            System.out.println(n2);
            int n3 = random.nextInt(6) + 100;
            System.out.println(n3);
        }
        // 무작위 값 생선
        long l = random.nextLong();
        float f = random.nextFloat();
        double d = random.nextDouble();
        boolean b = random.nextBoolean();
        System.out.printf("%d %f %f %b", l, f, d, b);

        // Math.random() 사용하는 법: 0.0~1.0 사이의 난수가 1개 발생
            // 0~10 사이의 값
        int ran1 = (int) Math.random() *10 ; // random은 double 리턴함.
        System.out.println(ran1);
        int num2 = (int) Math.random() * 100 ; // 0~100

        //1~10 사이 값
        int num3 = (int) (Math.random()*10 +1);

        int num4 = (int) (Math.random() * 10 + 10);
        int num = (int) Math.random() * 45;

        // 60~45
        //int num6 = random.nextInt(60-(-45) + 1 - min +1) + min;
        //int num7 = random.nextInt(60-(-45) + 1 - min +1) + min;





    }
}

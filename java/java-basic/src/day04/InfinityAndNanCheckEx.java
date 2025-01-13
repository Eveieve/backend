package day04;

public class InfinityAndNanCheckEx {
    public static void main(String[] args) {

        int x = 5;
        double y = 0.0;

        // 좌측 피연산자가 실수이거나 우측 피연산자가 0.0  또는 0.0 일때 Infinity 발생.
        // double z = x/y; Infinity
        double z = x % y;// NaN. Not a number

        System.out.println(z + 2);

        // 알맞은 코드로 리팩토링.
        // isInifinite 인지 확인 || isNaN 인지 확인!!
        // 나눗셈, 나머지 연산에서 꼭 ! 해야 됨. default!!!
        if(Double.isInfinite(z) || Double.isNaN(z)) // 0으로 나누는건 결과가 항상 Infinite 라서 절대 isNaN인지 ??
            System.out.println("값 산출 불가");
        else {
            System.out.println(z + 2);
        }
    }
}

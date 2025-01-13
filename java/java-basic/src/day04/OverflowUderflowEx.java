package day04;



public class OverflowUderflowEx {
    public static void main(String[] args) {
        byte b1 = 125;
        for (int i = 1; i <= 5; i++) {   // {  }
            b1++;   //b = b+ 1
            System.out.println("i의 값 = " + i + " " + "b1: " + b1);

        }
        int apple = 1;
        double pieceUnit = 0.1;
        //사과 1개를 0.1 단위의 10조각으로 보고, 그중 7조각을 학생들에게 나누어 주고 남은 조각을 출력하려고 합니다.

        int stuNum = 7;

        // double result = apple - stuNum * pieceUnit;
        // System.out.println("사과 1개에서 남은 조각 수 :" + result);

        int totalPieces = apple * 10;
        int result = totalPieces - stuNum;

        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과 1개에서 남은 양은 : " + result/10.0);

    }

    //연산과정 중 발생하는 오버플로우와 언더플로우는 기대값과는 다를 수 있으므로
    //타입의 범위내에서 연산이 수행되도록 신경써야 합니다. 만약 정수에서 발생할 가능성이 있다면 long 타입으로 연산하도록 합니다.
}
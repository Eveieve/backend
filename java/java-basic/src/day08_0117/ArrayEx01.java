package day08_0117;

// 많은 양의 값을 좀 더 효율적으로 관리, 운영할 수 없을까?
public class ArrayEx01 {
    public static void main(String[] args) {
        int sum = 0;
        int[] scores;
        scores = new int[10];
        scores[0] = 90;
        scores[1] = 80;
        scores[2] = 70;
        scores[3] = 55;
        scores[4] = 90;
        scores[5] = 66;
        scores[6] = 99;
        scores[7] = 80;
        scores[8] = 80;
        scores[9] = 80;



        // 한번에 배열 선언, 생성, 초기화.
        //int[] scores = new int[] {90, 80, 70, 60, 55, 90, 66, 99, 100};

        for(int i =0; i<10; i++ ){
            sum += i;
        }
        double avg = (double) sum/(scores.length); // 항상 배열은.length
        // double 로 캐스팅 하기 => 나눈값이 정확하게 소수점 자리로 저장될 수 있도록.
        System.out.printf("10명의 학생 총합 : %d, 평균 : %.1f", sum, avg);

        // 1. 정수형 배열 arr선언하시오. 고정 길이 자료구조기 때문에 미리 길이 지정해주기
        int[] arr = new int[5]; //생성할때 방의 개수 , 즉 몇게 데이터 저장해야 하는지 정해주어야 한다. "고정길이 자료구조";


    }
}

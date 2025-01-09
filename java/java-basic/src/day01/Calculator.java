package day01;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Calculator {
    public static void main(String[] args) {
//        //1. 데이터 임력
//        // 기본 입력 스트림 System.in (키보드)
//        Scanner in = new Scanner(System.in);
//        System.out.println("first number input: ");
//        int a = in.nextInt(); // 받아오기
//        System.out.println("second number input: ");
//        int b = in.nextInt();
//        int sum = 0; // 0으로 초기화 꼭 필요한지
//        //2. 데이터 처리
//        sum = a + b;
//        // 연산과 동시에 저장 되어야 함.
//        //3. 데이터 결과 저장
//        //4. 결과 출력
      int total = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println("i " + i);
               total = total + i;
            }
        }
        System.out.println(total);
    }
}
package day06;
import java.util.Scanner;

public class KeyControlEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int speed = 0;

        boolean run = true; // 현실세계에서 자동차가 달리다 ==> 컴퓨터 세계 boolean run = true (엔진을 켜서 달리다);


        while(run){
            System.out.println("-----------");

            String strNum = sc.nextLine(); //

            // == 는 주소값을 비교한다.
            // euqls 통해서 실제값을 비교하기.
            if(strNum.equals("1")){
                speed++;
                System.out.println("현재 속도 = " + speed);
                speed--;
                System.out.println("현재 속도 = "+ speed);
            }

        }
    }
}

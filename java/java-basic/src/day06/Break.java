package day06;

public class Break {
    public static void main(String[] args) {
        while(true){
            int num = (int) Math.random() * 6 +1; // 0~1.0 사이 랜덤 수 제공함.
            System.out.println(num);

            if(num == 6) {
                System.out.println("exiting game");
                break;
            }

        }
        System.out.println("프로그램 종료");
    }
}

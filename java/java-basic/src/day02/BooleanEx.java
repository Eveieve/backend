package day02;

public class BooleanEx {
    public static void main(String[] args) {
        boolean stop = true;
        boolean start = false;

        if(stop) {
            System.out.println("Stop lease");
        } else {
            System.out.println("Keep going");
        }

//        while(true){
//            //강제 종료 하지 않으면 무한 루프
//        }
        int bool = 10;
        boolean result = (bool == 20);
        System.out.println(result);

        result = (bool !=20); // bool 의 값이 20이 아닌가?
        System.out.println(result);

        result = (bool > 20);
        System.out.println(result);

        result = (0 < bool && bool > 20);
        System.out.println(result);

        result = (0 < bool || bool < 20);
            System.out.println(result);

    }
}

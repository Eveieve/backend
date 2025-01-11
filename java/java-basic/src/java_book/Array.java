package java_book;

public class Array {
    public static void main(String[] args) {
        //int[] test = new int[5];
        //int[] test = {80, 60, 22, 50, 75};
        
        int[] test1 = new int[3];
        System.out.println("test1을 선언했습니다.");
        System.out.println("배열요소 생성함.");

        test1[0] = 80;
        test1[1] = 60;
        test1[2] = 22;
        
        int[] test2;
        System.out.println("test2 선언함.");
        
        test2 = test1; // 배열 변수에 배열 대입.
        
        for(int i = 0; i<3; i++) {
            System.out.println("test1이 가리키는 " + (i+1) + "번째 사람의 점수는 " + test1[i] + "입니다");
        }
        
        for (int i = 0;i<3; i++) {
            System.out.println("test2가 가리키는 " + (i+1) + "번째 사람의 점수는 " + test2[i] + "입니다");
        }

        test1[2] = 100;
        System.out.println("test1이 가리키는 세 번째 사람의 점수 변경. test1[2] = " + test1[2]);

        System.out.println("test2가 가리키는 세 번째 사람의 점수도 같이 변경됨. test2[2] = " + test2[2]);
        System.out.println("test1 and test2 are not 2 different arrays. They point to one same array.");
        // 대입되는 좌변의 배열 변수가 우변의 배열 변수를 가리키게 된다.

//        배열변수의 특징 :
//        기본형 변수가 값을 저장하는 상자 '그자체'인 반면, 배열 변수는 값을 저장하는 상자가 '메모리의 어디에 존재하는지'에 대한 위치 정보를 가진다.
//        기본형 변수와 대비되는 개념의 변수를 '참조형 변수'라고 한다. 클래스형 변수와 인터페이스형 변수도 참조형 변수이다.

    }


}

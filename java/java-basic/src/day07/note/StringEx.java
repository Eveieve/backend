package day07;

import java.util.Scanner;

////자바의 문자열은 String 객체로 생성된다.
//  String name;
//  String hobby;
//  name = "신세계";  문자열리터럴 표현으로 값을 할당할 수 있다.  문자열은 String객체로 생성되고, 객체의 번지가 name(참조변수) 할당

public class StringEx {
    public static void main(String[] args) {
//     String name1 = "신세계";
//     String name2 = "신세경";
//
//     String name3 = new String("신세계");
//     String name4 = new String("신세경");
//     String name5 = new String("하하하");
//     String name6 = "하하하";
//
//        System.out.println("name1 :" + name1.hashCode());
//        System.out.println("name2 :" + name2.hashCode());
//        System.out.println("name3 :" + name3.hashCode());
//        System.out.println("name4 :" + name4.hashCode());
//        System.out.println("name5 :" + name5.hashCode());
//        System.out.println("name6 :" + name6.hashCode());
//        System.out.println(name6.equals(name4));
//


        Scanner in = new Scanner(System.in);
        int size = 3;
        int[][] arr1 = new int[size][size];
        int[][] arr2 = new int[size][size];
        int[][] arr3 = new int[size][size];

        // 1번 배열 입력
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr1[i][j] = in.nextInt();  // 배열에 값을 입력
            }
        }

        // 2번 배열 입력
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr2[i][j] = in.nextInt();  // 배열에 값을 입력
            }
        }

        // 1번 배열과 2번 배열의 합을 3번 배열에 저장
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
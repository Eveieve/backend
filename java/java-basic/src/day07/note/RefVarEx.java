package day07.note;

class Phone {
    String vendor; // Q. 사용자 정의 클래스에서는 선언만 ?
    String version;
    String model;
}

public class RefVarEx {
    public static void main(String[] args) {
//        int[] array1; // 정수형 배열 변수 array1 선언
//        int[] array2;
//        int[] array3;
//
//        array1 = new int[] {1,2,3};
//        System.out.println(array1[0] + array1[1] + array1[2]);
//        for(int i =0; i<array1.length; i++){
//            System.out.println(array1[i]);
//        }
//
//        for(int i : array1){ // enhanced for. 참조 객체 타입에 대해서만 사용가능.
//            System.out.println(i);
//        }

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = phone2; // phone2 의 주소값을 phone3 라는 참조변수에 저장하는 것.
        // phone3 갖고 있으면 phone2 를 갖고 있는 것처럼 사용가능함.
        // 하나의 공간을 두명이 사용하는 것 처럼 구현한 것임.

//        Phone phone4 = null;
//
//        System.out.println(phone1 == phone2); // Q. equals 써야 하는지?
//        System.out.println(phone1 == phone3);
//        System.out.println(phone2 == phone3);
//        System.out.println(phone4);

//        int[] intArray = null;
//        intArray[0] = 10; // NullPointerException.런타임 에러.
//        실행중 발생한 오류 널 상태이기 때문에 int array 에 store 할 수 없다.
//// => 자바는 프로그램 실행 도중에 발생하는 오류를 예외(Exception)이라고 부른다.

        int[] intArray = new int[] {0,0,0,0};
        intArray[0] = 10;
        // => 가능.

        for(int data: intArray) // enhanced array
            System.out.print(data + " ");

        for(int i=0; i<=intArray.length-1; i++) // 보통 for 문, 인덱스 이용.
            System.out.print(intArray[i]+ " ");

        String hobby = "travel"; // 문자열 값이 힙에 보관됨.
        hobby = null;
        // 기존 "travel"이라는 문자열이 저장된 heap 영역의 주소값을 지운 것.
        // 참조값을 해제. 관계를 끊어버리는 것.

        String kind1 = "car";
        String kind2 = kind1;
        System.out.println(kind2);
        //System.out.println(kind2.toString()); // redundant
        System.out.println(kind2.hashCode() + " " + kind1.hashCode());
        // 같은 객체를 가리키고 있음.
        // Q. hashCode()는 머지?
        // 이 코드 위에 kind1 = null 라 하면, NullPointerException 됨.

        //kind1 = null;
        System.out.println(kind1);
        System.out.println(kind2);
    }
 // 백업 용도로 주소값을 다른 방에 넣기도함..
}

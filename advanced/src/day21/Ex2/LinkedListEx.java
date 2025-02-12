package day21.Ex2;

//<LinkedList>

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

// arraylist 가 느린 이유: 0번 인덱스에 새로운 객체가 추가되면서 기존 객체의 인덱스를 한칸씩 뒤로 미는 작업을 수행하기 때문이다.
public class LinkedListEx {
    public static void main(String[] args) {

        // ArrayList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i =0;i<10000; i++) {
            list1.add(0, String.valueOf(i)); // convert to String;

        }

        startTime = System.nanoTime();
        for(int i =0;i<10000; i++) {
            list2.add(0, String.valueOf(i)); // convert to String;

        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns\n", "ArrayList 걸린 시간", (endTime - startTime));
    }
}

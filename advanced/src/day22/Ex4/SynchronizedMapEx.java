package day22.Ex4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/// Synchronized
public class SynchronizedMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>()); // 동기화 됨 - 실행해보기 // 총객체 수: 1000개
        //Map<Integer, String> map = new HashMap<>(); // 동기화 안됨 - 실행해보기, 총객체 수: 1002개(?)

        // 먼저 쓴 1000개만 맵에 답아짐 - 중복 키니까.


        // 작업 스레드 생성
        Thread threadA = new Thread(){
            @Override
            public void run() {
                // 객ㅊ ㅔ1000 추가
                for(int i =1; i<= 1000; i++) {
                    map.put(i, "내용" + i);

                }
            }

        };

        Thread threadB = new Thread(){
            @Override
            public void run() {
                // 객ㅊ ㅔ1000 추가
                for(int i =1; i<= 1000; i++) {
                    map.put(i, "내용" + i);

                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될때까지 메인 메소드를 기다리게 할것임
        // 메인 메소드도 스레드임.
        try {
            threadA.join();
            threadB.join();

        } catch (InterruptedException e) {
            System.out.println("외부 문제로 프로그램 종료.");
        } catch(Exception e1) {
            e1.printStackTrace();
        }

        // 저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("총 객체 수: " + size);


    }
}

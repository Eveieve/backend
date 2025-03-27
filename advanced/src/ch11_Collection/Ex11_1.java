package ch11_Collection;

import java.util.ArrayList;
import java.util.List;

public class Ex11_1 {
    public static void main(String[] args) {
        // 기본길이 (용량, capacity)가 10인 arraylist 생성하기
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 원래 객체만 저장 가능하다.
        // autoboxing에 의해 기본형이 참조형으로 자동 변환됨.
        //list1.add(new Integer(5));
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);

        // sublist 생성 - 읽기 전용.
        // 일부인 어레이리스트 재생성
        ArrayList list2 = new ArrayList(list1.subList(1,4));

        // 풀어쓰면 아래와 같다.
        List sub = list1.subList(1,4);
        ArrayList list3 = new ArrayList(sub);

        System.out.println(list1 + " " + list2);
        System.out.println(list3);

        // list1이 list2요소를 모두 포함하는가?
        System.out.println(list1.containsAll(list2));


    }
}

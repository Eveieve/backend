package day22.Ex5;

import java.util.*;

public class UnmodifiableEx {

    public static void main(String[] args) {
        // 수정할 수 없는 컬렉션 만드는 방법
        // 1. of()
        List<String> immutableList1 = List.of("A", "B", "C");
        //immutableList1.add("E");// runtime error
        for(String s : immutableList1) System.out.println(s + " ");

        Set<String> immutableSet1 = Set.of("A", "B", "c");
       // immutableSet1.remove("c");// runtime error

        Map<Integer, String> immutableMap1 = Map.of(1,"a", 2,"b", 3,"c");
        //immutableMap1.put(4,"d"); // runtime error

        // 리스트 컬렉션을 불변 컬렉션으로 복사해서 백업하기.
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        List<String> immutableList2 = List.copyOf(list2);

        // 배열로부터 리스트 불변 컬렉션으로 생성
        String array[] = new String[5];
        array[3] = "D";
        for(String s : array) System.out.print(s + " ");

        System.out.println();
        List<String> immString3 = Arrays.asList(array);
        for(String s : immString3) System.out.println(s + " ");

    }
}

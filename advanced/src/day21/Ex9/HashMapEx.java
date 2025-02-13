package day21.Ex9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("mun", 100);
        map.put("dong", 100);
        map.put("shin", 100);
        System.out.println(map.size());

        String key = "dong";
        int value = map.get(key);
        System.out.println();

        Set<String> keySet = map.keySet(); // 메소드 달기. 중복되는거 날리기 가능.
        Iterator<String> keyiter = keySet.iterator();

        while (keyiter.hasNext()) {
            String k = keyiter.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
            // map.remove(k); // 삭제한 데이터 리턴함
        }


    }
}

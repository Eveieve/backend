package day21.Ex1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class UpcastingMain {
    public static void main(String[] args) {

        Collection<Number> data1 = new ArrayList<>(); // <Number> 제너릭 타입 - 넘버타입과 그 하위 타입들 가능하다.
        data1.add(1);
        data1.add(0.2); // Float 가능.


        Collection<Number> data2 = new HashSet<>();
        data2.add(1);

        Collection<Number> data3 = new LinkedList<>();
        data3.add(1);

    }
}

package day20_0211.Lambda.Practice;

import java.util.Arrays;
import java.util.List;

public class Practice01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Jane","Jack");
        names.forEach(name -> System.out.println(name));
    }
}

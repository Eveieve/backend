package day20_0211.Generic.Ex4;

public class CompareUtil {

    public static <T extends Comparable<T>> T max(T a, T b) {

        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(CompareUtil.max(5, 10));

    }
}

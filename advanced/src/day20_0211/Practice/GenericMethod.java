package day20_0211.Practice;

public class GenericMethod {
    // T[] array => 어떤 타입의 array도 받을 수 있음.
    public static <T> void printArray(T[] array) {
        // 어떤 타입의 배열을 받아 요소를 출력하는 제너릭 메서드 printArray를 작성하세요
        for(T element:array) System.out.println(element);
    }

    public static void main(String[] args) {
        Double[] doubleArr = {0.42,28.212, 22.1, 90.000};
        GenericMethod.printArray(doubleArr);
    }

}

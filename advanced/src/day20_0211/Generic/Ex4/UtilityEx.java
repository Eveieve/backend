package day20_0211.Generic.Ex4;

public class UtilityEx {
    // printArray 메소드는 제너릭 덕분에 어떤 타입의 배열도 수용 가능한(T[] array) 유용한 메소드.
    public static <T> void printArray(T[] array) {
        // T 타입 -> 어떤 타입도 가능함.
        for(T element : array) System.out.println(element);
    }

    public static void main(String[] args) {
        String[] strArray = {"Hello", "Java"};
        UtilityEx.printArray(strArray);
        Integer[] integers = {1,2,3,4,5};
        UtilityEx.printArray(integers);
    }
}

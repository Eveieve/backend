package day20_0211.Lambda;

public class Main {
    public static void main(String[] args) {
        Transformer<Integer, String> intToString = (input -> "Number: " + input);

        String result = intToString.transform(10);
        System.out.println(result.toString() + 1);
    }
}

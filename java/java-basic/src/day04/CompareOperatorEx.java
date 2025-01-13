package day04;

public class CompareOperatorEx {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 10;
        boolean result1 = false;
        // 1.n1과 n2 의 값이 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = (n1 == n2);
        System.out.println(result1);
        // 2.n1과 n2 의 값이 다른지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = (n1 != n2);
        System.out.println(result1);
        // 3.n1과 n2 의 값이 n1이 n2보다 작거나 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        n1 = 10;
        n2 = 10;
        result1 = false;
        // 1.n1과 n2 의 값이 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = (n1 == n2);
        System.out.println(result1);
        // 2.n1과 n2 의 값이 다른지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = (n1 != n2);
        System.out.println(result1);
        // 3.n1과 n2 의 값이 n1이 n2보다 작거나 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = (n1 <= n2);
        System.out.println(result1);
        // 4.n1과 n2 의 값이 n1이 n2보다 크거나 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = (n1 >= n2);
        System.out.println(result1);
        // 5.n1과 n2 의 값이 n1이 n2보다 작은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = (n1 < n2);
        System.out.println(result1);
    }
}
        // 6.n1과 n2 의 값이 n1이 n2보다 큰지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
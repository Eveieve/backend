package jungol.Array1;
// not passed
public class Prac2 {
    public static void main(String[] args) {
// 초기화


        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = arr.length-1 ; i >= 0; i--) {
            //arr[i] = 대문자를 차례로 어떻게 대입하니, 하나하나씩??
            if (arr[i] != 'Z') {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
    }
}

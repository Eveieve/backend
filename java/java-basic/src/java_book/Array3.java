package java_book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array3 {
    // <배열의 내용 정렬하기>

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] test = new int[5];
        System.out.println(test.length + "명의 점수를 입력하시오."); // 5명의 점수 입력

        for (int i = 0; i < test.length; i++) { // 5번 입력 받기. 5번을 for 반복문으로.
            String str = br.readLine(); // 하나 입력 받고.
            test[i] = Integer.parseInt(str); // 입력 받은것을 int로 parse. 하여 test[0]부터 넣기.
        }

        // 배열 정렬하기. 작은것부터 큰것으로 정렬.
        for (int s = 0; s < test.length - 1; s++) { // 0부터 배열 끝까지. s가 0부터 시작했기 때문에 test.length -1
            for (int t = s + 1; t < test.length; t++) { // 배열 상자 하나를, 옆 상자와 비교
                if (test[t] > test[s]) { // 배열의 첫번째 요소보다 비교하는 (t) 요소가 클 경우
                    int tmp = test[t]; //
                    test[t] = test[s];
                    test[s] = tmp;
                }
            }
        }
    }
}

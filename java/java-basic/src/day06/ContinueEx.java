package day06;

// 1에서 10사이의 수 중에서 짜구만 출력하고 홀수인 경우는 다음 반복으로 넘어가도록.
public class ContinueEx {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                continue; // 출력하지말고, 아무것도 하지말고 다음 반복으로 넘어가
            System.out.print(i + " ");
        }

    }
}

// shift f9
// f8 한개 라인씩 넘어가기.


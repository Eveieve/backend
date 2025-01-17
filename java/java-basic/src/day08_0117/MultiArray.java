package day08_0117;

public class MultiArray {
    public static void main(String[] args) {
        // 정수형 2차원 배열 생성
        int[][] scores = {
                {80, 90, 96}, // scores[0]
                {76, 88} // scores[1]
        };

        // 1차원 배열의 길이(반의 수)
        System.out.println(scores.length + "scores[0]" + "scores[1]");
        System.out.println(scores[0][0]); // 80
        System.out.println(scores[1][1]); // 88

        for(int ban =0; ban<scores.length; ban++){
            for(int student =0; student<scores[ban].length;student++ ) //
                System.out.println(scores[ban][student]);
        }

    }
}

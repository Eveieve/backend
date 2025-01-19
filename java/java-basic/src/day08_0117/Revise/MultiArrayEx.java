package day08_0117.Revise;

public class MultiArrayEx {
    public static void main(String[] args) {

        int[][] scores = {
                {80, 90, 96}, // scores[0]
                {76, 88} // scores[1]
        };

        System.out.println(scores.length + "scores[0]" + "scores[1]");
        System.out.println(scores[0][0]); // 80
        System.out.println(scores[1][1]); // 88

        for (int ban = 0; ban < scores.length; ban++) {
            for (int student = 0; student < scores[ban].length; student++) //
                System.out.println(scores[ban][student]);
        }

        /// /////////// Use Enhanced For

//        for (int i = 0; i < scores[1].length; i++) {
//            sum += scores[1][i];
//
//        }
        int sum = 0;

        for(int score : scores[1]){
            sum += score;
        }

        double avg = (double) sum / (scores[1].length); // double 로 캐스팅
        System.out.println(sum);
        System.out.format("%.1f", avg); // 첫째 자리까지 반올림.
        //double roundedAvg = avg.
    }

}

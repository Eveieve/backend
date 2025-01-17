package day08_0117;

// 참조변수_배열_복습문제 9번

import java.io.*;

public class Homework {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 콘솔로 출력

        int count = 1;

        int numOfStu = 0;


        while (count <= 5) {
            bw.write("--------------------------------\n");
            bw.write("1.학생 수 2. 점수 입력 3. 점수리스트 4. 분석 5. 종료\n");

            bw.flush();

            count++;

            bw.write("선택 > " + count + "\n");
            bw.flush();
            bw.write("학생 수> ");
            bw.flush();
            numOfStu = Integer.parseInt(br.readLine()); // parse into int type
            int[] scores = new int[numOfStu];

            count++;
            /// ///////////////// count 2

            bw.write("선택 > " + count + "\n");

            for (int stu = 0; stu < numOfStu; stu++) {
                bw.write("scores[" + stu + "]> \n");
                bw.flush();
                scores[stu] = Integer.parseInt(br.readLine());
            }
            bw.flush();

            count++;

            bw.write("선택 > " + count); // count2

            bw.write("--------------------------------\n");
            bw.write("1.학생 수 2. 점수 입력 3. 점수리스트 4. 분석 5. 종료\n");

            bw.flush();

            count++;
            bw.write("선택 > " + count); // count3

            for (int stu = 0; stu < numOfStu; stu++) {
                bw.write("scores[" + stu + "]> " + scores[stu] + "\n"); // print scores
                bw.flush();
            }

            count++;
            bw.write("선택 > " + count); // 선택 4

            int max = scores[0];
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] > max) {
                    max = scores[i];
                }
                // get sum
                sum += scores[i];
            }
            bw.write("최고 점수: " + max);
            double avg = (double) sum / scores.length;
            bw.write("평균 점수: " + avg + "\n");
            bw.flush();

            ++count; //count 5

            bw.write("선택> " + count);
            bw.write("프로그램 종료");

        }

    }

}



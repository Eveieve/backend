package day11_0122.BestVOModeling;

import java.io.*;
import java.util.Arrays;

public class MovieMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 콘솔로 출력

        // 3개의 영화를 배열로 관리하기. 3개 영화정보 배열에 저장하기.
        bw.write("관리할 영화 개수: ");
        bw.flush();
        int mvNum = Integer.parseInt(br.readLine());
        MovieVO[][] mvArr = new MovieVO[mvNum][3];

        for (int i = 0; i < mvNum; i++) {
            MovieVO mvVO = new MovieVO();  // create first row(movie)
            for (int j = 0; j < mvNum; j++) { // 객체 안 데이터 받을 변수가 몇개인지 상관없이
                bw.write("영화 제목 입력: ");// 영화당 3개정보
                bw.flush();
                String mvTitle = br.readLine();
                mvVO.setTitle(mvTitle);
                bw.write("영화 러닝타임 입력: ");
                bw.flush();
                String mvRunningTime = br.readLine();
                mvVO.setRunningTime(mvRunningTime);
                bw.write("영화 등급 입력: ");
                bw.flush();
                String mvGrade = br.readLine();
                mvVO.setGrade(mvGrade);
                mvArr[i][j] = mvVO; // mvVO is an array
                bw.write("입력된 영화 정보는: " + mvArr[i][j] + "\n");
                bw.flush();
            }
            bw.write("총  영화 목록은: " + Arrays.deepToString(mvArr));
            bw.flush();
        }

        // 서버에 공간이 있어야 함.

        //MovieVO avatar = new MovieVO(); // 이렇게도 만들 수 있지만..!
        // System.out.println(avatar.toString());


    }
}

// Use setter if you want to add more information about the movie.
// ? cant you just update info with setter?

// 일단 세터를 만들어놓고 초기화 할때는 파라미터로 넣지 않아도 됨.
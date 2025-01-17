package day08_0117.IO;

// <Using BufferedReaderWriter>

// api 읽어보기.
// abstract class 는 instance 화할 수 없음.
// super class
// sub class

// https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html

import java.io.*;
import java.util.StringTokenizer;

public class baek11021 {
    public static void main(String[] args) throws IOException {
        // 일정한 크기 데이터를 버퍼라는 곳에 저수지처럼 받아놓는다. (스트리밍 서비스)
        // 문자를 처리하는 필터 클래스 = BufferedReader 클래스.

        // 실제 스트림을 읽어오는얘를 parameter 로 넣기.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 콘솔로 출력

        //String str = br.readLine(); // 한줄에 입력받기. 오류데이터 들어올 수 있음. =>io package는 exception처리반드시
        //bw.write(str); // str에 쓰기.
        //bw.write("hmmmm");
        //bw.flush();// 남은 값들 밀어내 비우기 -> 버퍼를 비움.

        int number = Integer.parseInt(br.readLine()); // 입력된 값 정수로 바꾸어 저장함.

        for (int i = 1; i <= number; i++) {
            // tokenizer가 성능이 더 좋음.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()); // 첫번째로 입력된 숫자 저장
            int second = Integer.parseInt(st.nextToken()); // 두번째로 입려된 숫자 저장

            // jvm 버전마다 처리해주는 내용이 다름. 17이상에서는 회색으로 된 것 생략 가능.
            bw.write(String.valueOf(first) + " "); // 첫번째 입력된 값을 스트링으로 변환하고 콘솔에다 출력.
            bw.write(String.valueOf(second) + "\n");

        }
        bw.flush();
    }
}

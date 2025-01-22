package day11_0122.Homework;

import java.io.*;

// number 20
public class Account2 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 콘솔로 출력


    public Account2() throws IOException {


    }

    public void printStars() throws IOException {
        bw.write("***********************************");
        bw.flush();
    }

    // show Menu method
    public void showMenu() throws IOException {
        printStars();
        bw.write("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
        printStars();
    }

    public void printChooseprompt() throws IOException {
        bw.write("선택 >");
        bw.flush();
    }


    // 계좌새성
}

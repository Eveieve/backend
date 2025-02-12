package day21.Quiz2_1;

// 콘솔로부터 학생 정보 입력받아 student.dat 파일에 저장하는 클래스

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class InputStudent {

    private String INPUT_DATA_FILE = "student.dat";
    private BufferedReader reader;
    private List<Student> recordSet;

    public InputStudent() { // 생성자
        this.recordSet = new ArrayList<Student>(); // 초기화할때 어레이 리스트 생성.
        this.reader = new BufferedReader(new InputStreamReader(System.in)); // 어떻게 써야 하는지 확인 하기
    }

    // 데이터 저장소로부터 모든 레코드를 읽어온다.
    public boolean ready() {
        ObjectInputStream in = null;
        File dataFile = null;

        try {
            dataFile = new File(INPUT_DATA_FILE); // INPUT DATA FILE 값의 새로운 데이터 파일 생성.

            if(!dataFile.exists()) {
                dataFile.createNewFile(); // File 클래스에 createNewFile();
            }
            in = new ObjectInputStream(new FileInputStream(dataFile));

            while(true) {
                this.recordSet.add((Student) in.readObject());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(in != null) in.close();
            } catch (IOException e) {

            }
            return true;
        }
    }
}

package day15_0204.Ex3;
import java.io.FileWriter;
import java.io.IOException;

public class FileTryWithResourceEx {
    public static void main(String[] args)  {
        FileWriter file = null; //왜 널 처리?
        //win : ctrl+alt+T   mac : option+command + T -> 자동으로 try catch 블럭 감싸기 가능
        try {
            file  = new FileWriter("data.txt");
            file.write("Java Advanced Programming");
        } catch (IOException e) { // 파일을 읽거나 쓰는 작업이면 항상 IOException 발생 가능성이 있는가?
            throw  new RuntimeException(e);
        } finally {
            try {
                file.close(); // 닫을때에도 IOException 가능성 있음.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

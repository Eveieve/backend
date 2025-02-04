package day15_0204.Ex3;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args)  {
        FileWriter file = null;
        //win : ctrl+alt+T   mac : option+command + T
        try {
            file  = new FileWriter("data.txt");
            file.write("Java Advanced Programming");
        } catch (IOException e) {
            throw  new RuntimeException(e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package day21.Quiz2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

@Getter
public class Student {
    private String name;
    private String id;

    private int eng;
    private int kor;
    private int math;

    private List<Integer> inScores; // 정수가 리스트 타입에 있음.

    public Student(List<Integer> inScores, String name, String id) {
        this.inScores = inScores;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", eng=" + eng +
                ", kor=" + kor +
                ", math=" + math +
                '}';
    }


}

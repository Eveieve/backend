package day21.Quiz2_1;

import java.io.Serializable; //?
import java.util.Arrays;

public class Student implements Serializable {

    private static final long serialVersionUID = -1617291827198273L;

    private String name;
    private int[] record; // array of ints

    public Student (String name, int[] record) {
        this.name = name;
        this.record = record;
    }

    public Student (String name, int kor, int eng, int math, int sci) {
        this.record = new int[4]; //  객체의 record 멤버 변수(배열) 의 공간 생성하기
        this.name = name;
        this.record[0] = kor;
        this.record[1] = eng;
        this.record[2] = math;
        this.record[3] = sci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getRecord() {
        return record;
    }

    public void setRecord(int[] record) {
        this.record = record;
    }

    // 학생 개체에 대한 총점을 구하는 메소드
    // 이게 학생 객체에 구현되는 이유는?
    public int sum() {
        int sum =0;
        for(int score : record) {
            sum += score;
        }
        return sum;
    }

    public double average() {
        return (double) sum() / record.length; // 같은 클래스 안에 있으니 평균 메소드 안에 총합 구하는 메소드 호출 가능.
    }

    public String grade() {
        int grade = (int) average()/ 10;
        if(grade>= 9) return "A";
        else if(grade>=8) return "B";
        else if(grade >= 7) return "C";
        else if(grade >= 6) return "D";
        else return "F";
    }

    public boolean equals(Object obj) {
        Student other;
        if(obj != null && obj instanceof Student) {
            other = (Student) obj;
            if(this.name != null & this.name.equals(other.getName()));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "record=" + Arrays.toString(record) +
                '}';
    }
}

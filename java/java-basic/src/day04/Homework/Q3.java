package day04.Homework;

public class Q3 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils/students;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = 534 - (students * pencilsPerStudent);
        System.out.println(pencilsLeft);
    }
}

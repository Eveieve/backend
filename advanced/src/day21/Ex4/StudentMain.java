package day21.Ex4;

public class StudentMain {
    public static void main(String[] args) {
        Student Anna = new Student(192718, "Anna");
        Student John = new Student(371619, "John");

        int isBig = Anna.compareTo(John);
        System.out.println(isBig); // John's sno is bigger, positive number returned.

        isBig = John.compareTo(Anna);
        System.out.println(isBig);
    }
}

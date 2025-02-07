package day18_0207.Quiz01;

public class Main {
    public static void main(String[] args) {

        Student stu1 = new Student.StuBuilder("38171", "Nanhee", "CS").build();
        System.out.println(stu1);
        Student stu2 = new Student.StuBuilder("19721", "Joey", "Psychology").addPhoneNumber("01029182912").addAddress("Seoul").build();
        System.out.println(stu2);
    }
}

package day21.Quiz2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i =1; i<=3; i++) {
            System.out.println("name?");
            String inputName = sc.nextLine();
            System.out.println("id?");
            String inputId = sc.nextLine();

            System.out.println("eng? ");
            int inEng = sc.nextInt();
            System.out.println("Kor? ");

            int inKor = sc.nextInt();
            System.out.println("Math? ");

            int inMath = sc.nextInt();
            sc.nextLine();

            List<Integer> inScores = new ArrayList<>();

            inScores.add(inEng);
            inScores.add(inKor);
            inScores.add(inMath); // inScores List에 저장하기

            Student stu = new Student(inScores, inputId, inputName);
            stuList.add(stu);

        }

        Collections.sort(stuList, Comparator.comparing(Student::getName)); // comparator 이용해  정렬. 오름차순, abc
        for(Student student : stuList) {
            System.out.println(student.getName() + " " + student.getId());
            System.out.println(student);
        }
    }
}

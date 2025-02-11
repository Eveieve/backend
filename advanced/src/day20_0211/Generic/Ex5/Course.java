package day20_0211.Generic.Ex5;

// 14:00~ 부터 한 수업.

public class Course {
    // Person 타입이면 등록가능한
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course1을 등록함");
    }
    // 학생만 등록 가능
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+ " registered Course2. ");
    }

     public static void registerCourse3(Applicant<? super Worker> applicant) {
         System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course3을 등록함.");
     }

}

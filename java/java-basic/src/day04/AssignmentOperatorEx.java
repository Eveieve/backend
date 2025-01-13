package day04;

public class AssignmentOperatorEx {
    public static void main(String[] args) {
        int res = 10;

        res *= 10; // res = res * 10;
        res %= 10;

        // 삼항(조건)연산자

        int score = 90;

        char grade = (score >=90) ? 'A' : (score >= 80) ? 'B' : 'C';

        System.out.println(score + "점은" + grade);

    }
}

package day13_0124.Homework.Quiz3;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student(){}

    public Student(String name, String subject, int fee){
        this.name = name;
        this.subject = subject;
        this.fee = fee;

    }

    public void calcReturnFee() {
        if(this.subject == "javaprogram"){
            this.returnFee = this.fee * 0.25;
        } else if(this.subject == "jsprogram"){
            this.returnFee = this.fee * 0.20;
        } else {
            System.out.println("그전 과정명은 없습니다");
        }
    }

    public void print() {
        System.out.printf("%s씨의 과정명은 %s이고 교육비는 %d이며 환급금은 %d입니다", this.name, this.subject, this.fee, this.returnFee);
    }
}

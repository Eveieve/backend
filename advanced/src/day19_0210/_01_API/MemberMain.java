package day19_0210._01_API;

public class MemberMain {
    public static void main(String[] args) {
        Member m1 = new Member("ss501");
        Member m4 = m1; // same person

        Member m2 = new Member("ss502");
        Member m3 = new Member("ss503");

        if(m1.equals(m4)) {
            System.out.println("동일한 회원입니다.");
        }else {
            System.out.println("동일한 회원이 아닙니다. ");
        }


    }
}

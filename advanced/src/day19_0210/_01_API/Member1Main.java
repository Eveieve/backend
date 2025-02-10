package day19_0210._01_API;

public class Member1Main {
    public static void main(String[] args) {
        Member1 m1 = new Member1("shin", 25);
        System.out.println(m1.name());
        System.out.println(m1.age());
        System.out.println(m1.toString());

        Member1 m2 = new Member1("shin", 25);
        System.out.println(m1.hashCode);

    }
}

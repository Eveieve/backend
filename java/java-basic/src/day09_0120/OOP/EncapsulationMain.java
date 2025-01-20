package day09_0120.OOP;

public class EncapsulationMain {

    public static void main(String[] args) {
        Encapsulation en1 = new Encapsulation();
        //System.out.println(en1.name); // 직접 접근 불가
        System.out.println(en1.getName()); // public method 통해서 접근 가능. 간접 접근 가능 (private 변수임에도)

        en1.setName("shisegyung");
        System.out.println(en1.getName());
    }


}

// 객체지향에서 캡슐화 : 클래스의 멤버(데이터)를 보호하는 것.
// 직접 접근을 제한 - 간접 접근만 가능하도록 조작.
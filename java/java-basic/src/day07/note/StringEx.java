package day07.note;

/// / 자바의 문자열은 String 객체로 생성된다.
//String name;
//String hobby;
//name = "shinsegae"; // String Literal로 값을 할당함. 문자열은 String 객체로 생성됨. 객체의 번지가 name이라는 참조 변수 안에 할당됨.

public class StringEx {
    public static void main(String[] args) {
        String name1 = "신세계"; // 상수풀에 저장됨. string constant pool.
        // set이라는 자료구조는 중복값을 저장할 수 없음. 같은 값에 대해 공간 할당 하지 않음.
        String name2 = "신세경";

        String name3 = new String("신세계"); // 이렇게도 문자열 넣을 수 있음.
        // 이미 상수풀에 존재하는 주소값을 name3에 넣어줌. 그래서 name3.hashCode 와name1.hasCode가 같음.
        // 최소한의 메모리로 중복되는 문자열을 효율적으로 관리하기 위해 상수풀을 만든 것임.
        String name4 = new String("신세경");
        // => 힙에 객체가 4개 생성되겠구나~
        String name5 = new String("hahaha");
        String name6 = "hahaha";


        System.out.println(name1 + " " + name1.hashCode());
        System.out.println(name2 + " " + name2.hashCode());
        System.out.println(name3 + " " + name3.hashCode());
        System.out.println(name4 + " " + name4.hashCode());
        System.out.println(name5 + " " + name5.hashCode());
        System.out.println(name6 + " " + name6.hashCode());

        // 힙에 상수풀이라는 것을 연결(바인딩) 해놨기 때문에 다른 주소값 2개임. 4개 아니라.

        // ==은 주소값을 비교하는 것. 실제값이 아니라.
        // 실제 문자열이 같은지 비교하려면 equals
        System.out.println(name6.equals(name5)); // true
        System.out.println(name6.equals(name4)); // false


    }
}

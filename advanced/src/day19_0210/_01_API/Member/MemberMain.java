package day19_0210._01_API.Member;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemberMain {
    public static void main(String[] args) {
//        Member m1 = new Member("ss501");
//        Member m4 = m1; // same person
//
//        Member m2 = new Member("ss502");
//        Member m3 = new Member("ss503");
//
//        if(m1.equals(m4)) {
//            System.out.println("동일한 회원입니다.");
//        }else {
//            System.out.println("동일한 회원이 아닙니다. ");
//        }

        Member m1 = new Member("신세종");

        Member m2 = new Member("신세종");

        // 다른 두 객체를 힙에 따로 따로 공간 있으니 다른 객체 (컴퓨터 주소 관리 입장)
        System.out.println(m1 == m2); // address comparison - false
        System.out.println(m1.equals(m2) ); // equals() compare address - false 이지만 오버라이딩 했음. Member class 에서.

        // 하지만 사용자가 원하는 것은 contents 검사.
        // 사용자 관점의 검사를 할땐?
        // equals()를 오버라이딩 할 수 있음.

        System.out.println(m1.hashCode());

        // 제너릭.
        // List에 는 멤버 타입만 저장한다.
        List<Member> members = new ArrayList<Member>(); //  리트느는 인터페이스, 어레이리스트는 클래스.
        // 언제든지 멤버 객체를 클래스 타입으로 변형할 수 있다는 의미.
        // 리스트 인터페이스 안에는.. 하위 의 것들을 넣을 수 있음
        //ArrayList<Member> members1 = new ArrayList<>();  // 이렇게 할 수도 있지만 확장성을 고려하여 위의 코드로 작성하기.

        Set<Member> members1 = new HashSet<>(); // 완벽하게 사용자 관점에서 두 객체가 하나인지 판단가능. hashCode() + equals() 둘다 사용함.
        members.add(m1);
        members1.add(m2);
        System.out.println(members1.size());
        // Collection - HashMap, HashSet, HashTable 은 객체가 논리적으로 같은지 비교할때, 해시코드 값을 먼저 비교하고 같다면 equals()로 비교한다.



    }
}

package day19_0210._01_API;

import java.util.Objects;

// < 객체의 동등 비교 >
public class Member extends Object{

    String id;
    String name;

    public Member(String id) {
        this.id = id;
    }

    // Overriding using equals()
    // bc all classes extend Object class
//    @Override // 오브젝트 크래스의 equals() 메소드 재정의.
//    public boolean equals(Object obj) { // 가장 큰 객체 타입으로 받기
//        if(obj instanceof Member target) {// Member 클래스에서 온 객체(Member 타입) 인지 검사하고, 타입 변환 후, target 변수에 대입한다.
//            // 객체를 비교 한 다음,
//            // 객체의 'id' 필드가 같은지 비교
//            if(id.equals(target.id)){ // 그 변수에 있는
//                // 아이디도 같으면 같은 회원
//                return true;
//            }
//        }
//        //return super.equals(obj);
//        return false; // 같이 않으면 거짓 반환.
//    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return true;
        Member member = (Member) obj;
        return Objects.equals(name, member.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

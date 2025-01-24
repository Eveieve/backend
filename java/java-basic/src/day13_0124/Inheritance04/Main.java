package day13_0124.Inheritance04;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();

        Child child = new Child();

        // upcasting -> child to parent
        // Parent 클래스 이름 적어주기.
        Parent childToPar = (Parent) child; // 접근할 수 있는 멤버가 줄어듬.
        // 권한을 줬다뺐다할 수 있음!
        // 모든 서버는 각각의 권한 관리를 이렇게 타입으로 관리함!
        System.out.println(childToPar.name);
        System.out.println(childToPar.age);
        //System.out.println(childToPar.num); // child 였지만 형변환으로 access 불가.

        // downcastig -> parent to child
        Child ParToChild = (Child) childToPar; // 원래대로 돌아옴 . 멤버 개수 원래대로.
        System.out.println(ParToChild.num); // 원래대로 num 멤버 접근 가능.

        // 멤버 개수를 조절한다.

    }
}

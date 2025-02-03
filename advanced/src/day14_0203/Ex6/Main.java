package day14_0203.Ex6;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child(); // why ..
        // 부모의 생성자 먼저 부른 상태에서 자식 생성자를 부름.
        // 부모타입
        // 생성자를 호출하려고 했더니~ 부모 생성자를 먼저 호출해야 하네?
        // 부모 생성자 호출되고 돌아오면, 이때 자식 생성자 공간이 만들어짐
        // 스택에 부모타입만 받아야 함

        parent.field1 = "data";
        parent.method1();
        parent.method2();
        //parent.field2; // impossible.
        //parent.method3();// impossible.

        Child child = (Child) parent; // cast type to Child
        // 강제 타입 변환.
        // 스택의 parent  가 자식을 가리키게됨.

    }
}

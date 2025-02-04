package day15_0204.Ex1;

//public class Student extends Person{
//// 'student' is not allowed in sealed hierarchy
//}

//permit 지정되지 않은 클래스이기 때문에 자식 상속 받을 수 없음.
public class Student extends Manager{
    //봉인된 Person 클래스의 permits 가 되지 않았으므로 상속 불가 , Person 자식 클래스인 Employee 도 해제가 되지 않았고 final 클래스이므로 상속 내용
    //봉인 해제된 Manager 클래스는 상속 가능합니다.

    @Override
    public void work() {
        System.out.println("공부를 열심히 합니다.");
    }
}

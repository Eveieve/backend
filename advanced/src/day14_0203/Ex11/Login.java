package day14_0203.Ex11;

class Person {
    public String name;

    public Person(String name) {
        // constructor
        this.name = name;
    }

    public void run() {
        System.out.println("person runs.");
    }

}

class Student extends Person {
    // person 에 디폴트 생성자 없으니까 뭐라함.
    // 슈퍼에게 넘겨주는 생성자를 꼭 써줘야 함.
    public int studentNo;
    public Student(String name, int studetNo) {
        super(name); // 이걸 해줘야됨 -  디폴트 생성자가 없으면. 있으면 문제 없음.
        this.studentNo = studentNo;
    }

    public void study() {
        System.out.println("student studies. ");
    }
}


public class Login {

}

package day10_0121;

import day10_0121.DTO.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person Alice = new Person(); // 디폴트 생성자는 클래스를 인스턴스할때 반드시 필요하다. 클래스를 메모리에 로드해서 (mount)띄어주는 역할. 메모리를 생성하는 역할. 반드시 클래스 이름과 같아야 한다.
        Alice.setName("Alice"); // use setter if 'name'variable is set as 'private'.
        //Alice.name = "Alice"; // this is possible if name is set just declared 'String name;'

        // Alice.age = 29;
        Alice.setAge(29);
        //Alice.phone = "28182312";
        Alice.setPhone("22338374283");
        //=> 초기화 시키기.

        Person John = new Person("John", 56, "829187312"); // creates memory
        // => 생성과 동시에 초기화 시키는 방법 - using constructor overloading.
        // 생성자 오버로딩 통해 객체 생성 후 멤버변수에 값을 할당.

        John.workout();
        Alice.eat();

        System.out.println(Alice.getName() + Alice.eat()); // Alice.eat() method should return something.


        // Object Nia
        Person nia = new Person("nia", 23, "i1u231i23");
        // 그냥 new Person() 으로 생성하면 null 값 나옴.

        System.out.println(nia.getName());
        System.out.println(nia.getName() + nia.eat());
        nia.walk();

    }
}

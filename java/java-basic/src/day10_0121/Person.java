package day10_0121;

public class Person {
    private String name;
    int age;
    String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person() {
        // class 안의 variable 들을 명시하지 않음 - 그냥 new Person() 으로 생성 후, nia.name 하면 null 값임.
    }; // constructor.
    // if constructor is not explicitly defined, compiler creates one for you.
    // 만약 오버로딩한다면 , 디폴트 생성자를 굳이 만들어주지 않음. 그러므로, 오버로딩 한다면 디폴트 생성자를 명시해야 함.

    public Person(String name, int age, String phone) {
        // 같은 이름 생성자 불가. 하지만, 오버로딩 할 수 있음. 파라미터 개수/타입 조작해서.
        this.name = name;
        this.age = age;
        this.phone = phone;
        // 내 객체의 주소값을 저장하는 this.
        // Overloading constructor
    }

    public Person(String name, String phone) {
        this.name = name; // will only get name and phone this time.
        this.phone = phone;
        // this.name, this.phone 은 new통해 힙에 만들어진 메모리 공간.
        // this.name = name;에서 name 은 힙에 옮겨놓기 위해 쓰는..?
        // 반영구적으로 보존하고 싶으면 데베에 옮겨야됨. 시스템이 꺼지면 날아감.
        // constructor does not return anything - doesn't need 'void' either.
    };

    public void workout() {
        System.out.println("workout");
    }

    public String eat() {
        return "eat";
    }

    public void walk() {
        System.out.println("walk");
    }
}

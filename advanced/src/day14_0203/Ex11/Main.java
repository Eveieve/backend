package day14_0203.Ex11;

public class Main {

    public static void personInfo(Person person) {
        System.out.println("name : "+ person.name);
        person.run();
        if(person instanceof Student student){
            System.out.println("student number is : " + ((Student) person).studentNo);
            ((Student) person).study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("shinsegae");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("Tom", 17281653);

        //PersonInfo(p2);

    }
}

package day12_0123.Singleton;

public class SingletonMain {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // 동일한 객체를 참조(가리키는지) 확인

        if(obj1 == obj2)
            System.out.println("they refer to the same object");
        else System.out.println("they refer to a different object");

    }
}

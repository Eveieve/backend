package day20_0211.ReflectionEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMain {
    public static void main(String[] args) throws Exception{
        // 클래스 객체 가져오기 (Class.forName()메소드 방식)
        Class<Person> personClass = (Class<Person>) Class.forName("day20_0211.ReflectionEx.Person");

        // 생성자 가져오기
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);

        Person p1 = constructor.newInstance("신세계", 30);
        // 동적으로 메소드 가져와서 실행
        p1.getField();

        // public, private, public static 메소드들 수행
        Method total = personClass.getMethod("total", int.class, int.class);
        int result1 = (int) total.invoke(new Person(), 10,20); // int 타입으로 캐스팅
        System.out.println(result1);

        // static method
        Method staticTotal = personClass.getMethod("staticTotal", int.class, int.class);
        int staticResult = (int) staticTotal.invoke(null, 100,200); // 객체는 널(줄 필요 없음), 스태틱이니까
        System.out.println("staticResult: " + staticResult);

        // private method
        Method privateTotal = personClass.getDeclaredMethod("privateTotal", int.class, int.class);
        privateTotal.setAccessible(true);
        int privateResult = (int) privateTotal.invoke(new Person(), 200, 300);
        System.out.println("privateTotal:" + privateResult);



    }
}

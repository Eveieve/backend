package day20_0211.ReflectionEx;
import java.lang.reflect.*;

public class Person {
    public String name;
    private int age;
    public static int weight= 50;

    public Person(){}

    // 이름과 나이를 입력 받는 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getField() {
        System.out.printf("name: %s age: %d\n", name, age);

    }
    public int total(int left, int right) {
        return left + right;
    }

    public static int staticTotal(int left, int right) {
        return left + right;
    }
}

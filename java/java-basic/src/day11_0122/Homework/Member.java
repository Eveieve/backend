package day11_0122.Homework;

import java.util.Objects;

public class Member {

    private String name;
    private String id;
    private String password;
    private int age;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public boolean login(String id, String password) {
        boolean result;
        result = Objects.equals(this.id, id) && Objects.equals(this.password, password);
        return result;
        // is it better to use equals for comparing strings?
    }

    public void logout(String id) {

        System.out.println(id+ "님이 로그아웃하였습니다");
    }
}

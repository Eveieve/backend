package day19_0210._01_API.Person;

// 데이터 전달 위한 클래스 - DTO data transfer object. 반복적으로 사용되는 코드를 줄이기 위해 java14부터 record 도입되었다.
// 정보 단위를 record 함(행). 또는 DTO.
// database - row, / class - DTO, /정보 단위 - record 라고 표현한다.

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

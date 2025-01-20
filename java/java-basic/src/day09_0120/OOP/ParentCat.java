package day09_0120.OOP;

public class ParentCat {
   private String breed = "샴 고양이";

    void methodParentCat() {
        System.out.println("parent cat - meow");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

// java - 컴파일러가 이름으로 로드함.
class Kitten extends ParentCat{
    void methodKitten() {
        System.out.println("kitten - meow");
    }
}

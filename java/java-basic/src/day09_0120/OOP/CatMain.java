package day09_0120.OOP;

import day09_0120.OOP.Kitten;

public class CatMain {
    public static void main(String[] args) {
        ParentCat momCat = new ParentCat();

        String breed = momCat.getBreed();

        System.out.println("momCat's breed: " + breed);

        momCat.methodParentCat();

        ParentCat momCat1 = new ParentCat(); // class ParentCat. 메모리가 허용하는 범위 내 클래스로 객체 생산 가능.
        momCat1.setBreed("점박이");

        System.out.println(momCat1.getBreed());
        momCat1.methodParentCat();

        Kitten kitty1 = new Kitten();
        kitty1.setBreed("스핑크스");
        kitty1.methodParentCat();
        kitty1.methodKitten();


    }


}


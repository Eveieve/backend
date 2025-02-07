package day18_0207.Ex06.BuilderPattern;

// 기본 생성자 오버로딩에서 보였던 가독성 문제 해결됨.
// 파라미터에 대해 해당되는 setter 메소드를 호출하면서 유연하게 객체 생성이 가능해짐.

/// 하지만 문제 있음.
// 문제 1: 일관성 문제 - consistency.
// 문제 2: 불변성(이뮤터블) 문제

public class HamburgerLotteria {
    public static void main(String[] args) {

        Hamburger Hee = new Hamburger.BurgerBuilder("flat", "beef").addCheese().build();
        System.out.println(Hee); // calls toString() method

        Hamburger vegetarian = new Hamburger.BurgerBuilder("wheat", "avocado").addLettuce().addTomato().build(); // 빌드로 마무리@
        System.out.println(vegetarian
        );

        // 세트 메뉴는 음료가 필수
        Hamburger set = new Hamburger.BurgerBuilder("flat", "avocado", "Coke").addLettuce().addCheese().addBacon().build();
        System.out.println(set);
    }
}

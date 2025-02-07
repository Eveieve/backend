package day18_0207.Ex06.Lombok;

// <빌더 패턴>
// 복잡한 객체를 단계적으로 생성할 수 있도록 하는 디자인 패턴
// 옵션이나 매개변수 가진 객체 만들때 유용함.

import lombok.*;

@Data
public class Hamburger {
    // 필수 멤버
    private String bun; // 번 몇개.
    private String patty;
    private boolean drink;

    // 선택 멤버
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;
   // private boolean drink;

    /// ? 왜 프라이빗으로 둘까 - 캡슐화를 위해
    private Hamburger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;

    }

    @ToString
    @NoArgsConstructor
    @AllArgsConstructor


    // 버거 빌더 스태틱 이너 클래스 - 객체 생성하지 않고 Hamburger.BurgerBuilder 이렇게 부를 수 있도록
    public static class BurgerBuilder {
        private String bun; // 번 몇개.
        private String patty;
        private String drink; // 세트에 필수요소인 음료

        // 선택 요소
        // 버거빌더 이너 클래스의 메소드에서 재료들을 넣을 건지 참/거짓 설정하여 버거빌더(this) 돌려주기.
        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;
        private boolean bacon = false;
        //private boolean drink = false;

        // BurgerBuilder constructor
        // 메인에서 부를 수 있도록 퍼블릭
        // 필수적으로 들어가야 하는 멤버들을 초기화해주는 이너클래스 버거빌더 생성자
        public BurgerBuilder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        // 필수적으로 들어가야 하는 멤버들을 초기화해주는 이너클래스 버거빌더 생성자
        public BurgerBuilder(String bun, String patty, String drink) {
            this.bun = bun;
            this.patty = patty;
            this.drink = drink;
        }


        // 선택적 요소들을 단계적으로 추가할 수있도록 메소드 설계하기.
        public BurgerBuilder addCheese() {
            this.cheese = true; // 치즈 추가하겠다
            return this; // 자신의 값 리턴 가능 - method chaining
        }

        public BurgerBuilder addTomato() {
            this.tomato = true;
            return this;
        }

        public BurgerBuilder addLettuce () {
                this.lettuce = true;
                return this;
        }

        public BurgerBuilder addBacon () {
                this.bacon = true;
                return this;
        }

        // 세트 메뉴에서 음료가 필수라고 할때, 선택적 참거짓 토글하는 메소드만들지 않고 버거빌더 생성자에 초기화할 수 있게 둔다.
//        public BurgerBuilder addDrink() {
//                this.drink = true;
//                return this;
//        }

        /// 핵심! 최종적으로 BurgerBuilder 객체를 반환하는 메소드 생성하기.
        /// 바깥 클래스인 햄버거에서 객체를 생성하여 돌려준다. (this는 빌더)
        public Hamburger build () {
                return new Hamburger(this);
        }

        }// end of inner class

    @Override
    public String toString() {
        return "Hamburger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", drink=" + drink +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", bacon=" + bacon +
                '}';
    }
}

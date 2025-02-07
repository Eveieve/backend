package day18_0207.Ex06.BuilderPattern;

// <빌더 패턴>
// 복잡한 객체를 단계적으로 생성할 수 있도록 하는 디자인 패턴
// 옵션이나 매개변수 가진 객체 만들때 유용함.

public class Hamburger {
    // 필수 멤버
    private String bun; // 번 몇개.
    private String patty;

    // 선택 멤버
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;
    private boolean drink;

    /// ? 왜 프라이빗으로 둘까
    private Hamburger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.drink = builder.drink;
    }

    // 버거 빌더 스태틱 이너 클래스 - 객체 생성하지 않고 Hamburger.BurgerBuilder 이렇게 부를 수 있도록
    public static class BurgerBuilder {
        private String bun; // 번 몇개.
        private String patty;

        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;
        private boolean bacon = false;
        private boolean drink = false;

        // BurgerBuilder constructor
        // 메인에서 부를 수 있도록 퍼블릭
        public BurgerBuilder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
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

            public BurgerBuilder addDrink() {
                this.drink = true;
                return this;
            }

            /// 핵심! 최종적으로 BurgerBuilder 객체를 반환하는 메소드 생성하기.
            public Hamburger build () {
                return new Hamburger(this);

            }

        }// end of inner class

        // 값을 쉽게 볼 수 있도록
        @Override
        public String toString() {
            return "Hamburger{" +
                    "bun=" + bun +
                    ", patty=" + patty +
                    ", cheese=" + cheese +
                    ", lettuce=" + lettuce +
                    ", tomato=" + tomato +
                    ", bacon=" + bacon +
                    '}';
        }
    }

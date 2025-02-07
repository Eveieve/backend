package day18_0207.Ex06;

// Example for Builder Pattern
public class Hamburger {
    // 필수 멤버
    private int bun; // 번 몇개.
    private int patty;

    // 선택 멤버
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    // 햄버거를 만드는 다양한 방식
    public Hamburger(int bun, int patty, int tomato) {
        this.bun = bun;
        this.patty = patty;
        this.tomato = tomato;
    }
    // 햄버거를 만드는 다양한 방식
    public Hamburger(int tomato, int lettuce, int cheese, int patty, int bun) {
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.cheese = cheese;
        this.patty = patty;
        this.bun = bun;
    }


}

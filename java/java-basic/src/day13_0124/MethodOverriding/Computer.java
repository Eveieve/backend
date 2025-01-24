package day13_0124.MethodOverriding;

// caculator + web browsing + watch movie + 원의 면적 계산

public class Computer extends Calculator {
    // 원의 면적 계산 기능 :
    private double radius;

    public Computer(){}

    public Computer(Double r) {
        this.radius = r;
    }

    public void calArea() {
        System.out.println("Calculates circle area");
        double result = Math.PI * this.radius * this.radius;
        System.out.println("area is + " + result );
    }

}

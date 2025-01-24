package day13_0124.MethodOverriding;

public class Calculator {

    private int row;
    private int column;

    public Calculator() {

    }

    public Calculator(int row, int col) {
        this.row = row;
        this.column = col;
    }

    // 시그니처는 바꿀 수 없기 때문에 대부분 public 으로 메서드를 정의한다.
    public void calArea(int row, int col) {
        System.out.println("calculates rectangle area");
        int result = this.row * this.column; // result 눈 로컬 변수, 힙에 만들어지지 않음.
        System.out.println("Calculation complete. Area is + " + result);
    }
}

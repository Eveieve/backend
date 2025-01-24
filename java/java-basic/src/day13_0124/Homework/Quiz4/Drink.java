package day13_0124.Homework.Quiz4;

public class Drink {
    //static String name;
    String name;
    int price;
    int count;

    public Drink() {
    }

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        int total = this.price * this.count;
        return total;
    }

    // 스태틱은 오버라이딩 안됨
    public static void printTitle() {
        System.out.println("상품명    단가     수량     금액");
    }

    public void printData() {
        System.out.printf("%s     %d      %d      %d\n", this.name, this.price, this.count, this.price * this.count);

    }


}

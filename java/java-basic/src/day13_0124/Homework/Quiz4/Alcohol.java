package day13_0124.Homework.Quiz4;

public class Alcohol extends Drink {
    double alcper;

    public Alcohol() {

    }

    public Alcohol(String name, int price, int count, double alcper){
        super(name, price, count); // 부모의 파라미터 3개있는 생성자 획득
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.println("상품명(도수[%])  단가    수량    금액");
    }

    @Override
    public void printData() {
        System.out.printf("%s     %d      %d     %f\n", this.name, this.price, this.count, this.alcper);
    }
}

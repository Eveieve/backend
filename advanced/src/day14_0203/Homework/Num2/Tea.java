package day14_0203.Homework.Num2;

public class Tea extends Beverage{
    public static int amount;

    public Tea(String name){
        super(name);
        calcPrice(name);// 티 종류의 가격을 정해주는 것임.
        increaseAmount();
    }

    public Tea(String name, int amount) {
        super(name);
        this.amount = amount;
    }

    public static void increaseAmount(){
        Tea.amount += 1;
    }
    @Override
    public void calcPrice(String name) {
        if (name == "ginsengTea")
            this.setPrice(2000);
        if (name == "red ginsengTea")
            this.setPrice(2500);
        if(name == "lemon tea")
            this.setPrice(1500);
    }
}

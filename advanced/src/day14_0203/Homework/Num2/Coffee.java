package day14_0203.Homework.Num2;

public class Coffee extends Beverage{
    //public int amount;
   public static int amount; ////?????

public Coffee(String name){
    super(name);
    increaseAmount();
    //setPrice(name);
    calcPrice(name);
}

public Coffee(String name, int amount) {
    super(name);
    this.amount = amount; ///?
    increaseAmount();
}

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Coffee.amount = amount;
    }

    public static void increaseAmount(){
     Coffee.amount += 1;
    } // 이걸 Beverage 에 스태틱으로 두고 수량을 그냥 올려도 될 것 같은데

    // 이게 왜 calcprice
    @Override
    public void calcPrice(String name) {
        if (name == "Americano")
            this.setPrice(1500);
        if (name == "CafeLatte")
            this.setPrice(2500);
        if(name == "Cappuccino")
            this.setPrice(3000);

    }
}

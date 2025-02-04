package day14_0203.Homework.Num2;

public abstract class Beverage {
private String name;
protected int price; // can access from same package

public Beverage(){

}

public Beverage(String name){
    this.name = name;
}


public abstract void calcPrice(String name);

    public int getPrice(String name) {
        return price;
    } // make it static if you want to use this method without creating instance.. A

    public void setPrice(int price) {
        this.price = price;
    }

//    public void setPrice(int price) {
//        this.price = price;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {

}
}

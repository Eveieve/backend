package day15_0204.Homework.Num2;

public abstract class Payment {
    protected String shopName;
    protected String productName;
    protected long productPrice;

    public Payment(String shopName, String productName, long productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void pay() {
       // CardPayment cardPay = new CardPayment();
  //익셉션 처리 어디서함?? 여기임??
    }
}

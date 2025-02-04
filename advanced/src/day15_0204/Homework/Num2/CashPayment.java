package day15_0204.Homework.Num2;

public class CashPayment extends Payment{
    private String cashReceiptNumber;

    @Override
    public String toString() {
        return "CashPayment{" +
                "cashReceiptNumber='" + cashReceiptNumber + '\'' +
                '}';
    }

    public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber){
        super(shopName, productName, productPrice);
        this.cashReceiptNumber = cashReceiptNumber;

//        @Override
//        public String toString() {
//
//        }
    }
}

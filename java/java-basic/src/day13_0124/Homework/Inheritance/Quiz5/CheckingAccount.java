package day13_0124.Homework.Inheritance.Quiz5;

public class CheckingAccount extends Account {
    private String cardNo;

    public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
        super(accId, ownerName, balance, cardNo);
        this.cardNo = cardNo;
    }

    // implemented method from abstract class Count
    @Override
    public void calcRate() {
        // empty for now
    }

    public void pay (String cardNo, long amount) {
        if(this.cardNo == cardNo && amount < this.getBalance()){
            long temp = this.getBalance() - amount;
            this.setBalance(temp);
        }else {
            System.out.println("지불이 불가능합니다.");
        }
    }
}

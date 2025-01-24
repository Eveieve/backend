package day13_0124.Homework.Inheritance.Quiz5;

public abstract class Account {
    private String accId;
    private long balance;
    private String ownerName;


    public Account() {

    }

    public Account(String accId, long balance, String ownerName) {
        this.accId = accId;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    // 파라미터의 순서 바꿔서 생성자 하나 더 생성
    public Account(String accId, String ownerName, long balance, String cardNo) {
        this.accId = accId;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public abstract void calcRate();

    public void deposit(long money) {
        this.balance = this.balance + money;
    }

    public void withdraw(long money) {
        this.balance = this.balance - money;
    }

    public long getBalance() {
        return this.balance;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }


}
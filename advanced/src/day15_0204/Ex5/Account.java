package day15_0204.Ex5;

public class Account {

    private long balance;

    public Account(){};

    public Account(long balance) {
        this.balance = balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    // throws 는 던지다
    public void withdraw(int money) throws InsufficientEx { // 호출한 곳으로 예외 떠넘기기.
        if(this.balance < money) {
            throw new InsufficientEx("잔고 부족으로 출금 불가" + (money- this.balance) + "가 부족합니다. "); // throw 는 발생시킨는 것.
        }
        this.balance -= money;
        // try catch 하지 않고 이렇게 예외 처리 - 가독성이 높아짐.
    }
}

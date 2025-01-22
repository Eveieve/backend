package day11_0122.Homework;

public class Account {

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    private int balance; //0<= balance <= 1000 000

    public Account() {

    }

    public long getBalance(int num  ) {
        return balance;
    }

    public void setBalance(int num) {
        int balanceCP = this.balance;
        balanceCP += num; // is this a temp ????

        if(balanceCP >= MIN_BALANCE && balanceCP <= MAX_BALANCE)
            this.balance += num;
        // else 현재값 유지.
        }

    }


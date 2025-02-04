package day15_0204.Ex5;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(100000);
        System.out.println("예금액은 " + account.getBalance());

        // 출금
        try {
            account.withdraw(300000);
        } catch (InsufficientEx e) {
            //throw new RuntimeException(e);  no need for this line
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}

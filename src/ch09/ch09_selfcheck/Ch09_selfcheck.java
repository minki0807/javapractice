package src.ch09.ch09_selfcheck;

public class Ch09_selfcheck {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000);
        try {
            account.deposit(50000);
            account.withdraw(200000);
        } catch (LowBalanceException e) {
            System.out.println("오류: 잔액이 부족합니다.");
        } finally {
            System.out.println("현재 잔액: " + account.getBalance() + "원");
        }
    }
}

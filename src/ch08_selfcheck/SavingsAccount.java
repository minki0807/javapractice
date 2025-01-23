package src.ch08_selfcheck;

public class SavingsAccount implements BankAccount, InterestBearing {

    String accountNumber;
    double balance;
    double interestRate;
    double monthlyDeposit;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate, double monthlyDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate;
        this.monthlyDeposit = monthlyDeposit;
    }

    public void withdraw(double amount) {
        System.out.println("적금 계좌에서는 출금할 수 업습니다.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금됐습니다.");
            System.out.println("잔액: " + balance + "원");
        } else {
            System.out.println("입금액은 0보다 커야 합니다.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("---계좌 정보---");
        System.out.println("계좌 번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
        System.out.println("이자율: " + (interestRate * 100) + "%");
    }

    public void addInterest() {
        double interest = balance + interestRate;
        balance += interest;
        System.out.println("이자 " + interest + "원이 추가됐습니다. ");
    }

    public void addMonthlyDeposit() {
        balance += monthlyDeposit;
        System.out.println("매월" + monthlyDeposit + "원을 적금합니다.");
    }
}

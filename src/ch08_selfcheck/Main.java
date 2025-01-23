package src.ch08_selfcheck;

public class Main {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount("123-4567890", 100000, 0.02, 5000);
        mySavings.addMonthlyDeposit();
        mySavings.addInterest();
        mySavings.displayAccountInfo();


    }
}

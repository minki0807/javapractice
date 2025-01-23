package src.ch08.ch08_interface;

public class Main {
    public static void main(String[] args) {
        CheckingAccount myChecking = new CheckingAccount("123-4567890", 100000, 0.02);
        myChecking.displayAccountInfo();
        myChecking.withdraw(100000);
        myChecking.deposit(50000);
        myChecking.addInterest();
        myChecking.displayAccountInfo();
    }
}

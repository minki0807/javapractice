package src.ch08.ch08_abstract;

public class Main {
    public static void main(String[] args) {
        CheckingAccount myChecking = new CheckingAccount("123-4567890", 100000);
        myChecking.displayAccountInfo();
        myChecking.withdraw(100000);
        myChecking.deposit(50000);
    }
}

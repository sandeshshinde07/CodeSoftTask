public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(50000.0);

        ATM atm = new ATM(bankAccount);

        atm.run();
    }
}

public class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {

            balance += amount;
            System.out.println("Deposited: " + amount );
        
    }
    
    public void deposit(double amount, String note) {
    balance += amount;
    System.out.println("Deposited: " + amount + " - Reason: " + note);
}

    public void withdraw(double amount) {

            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount );
            } else {
                System.out.println("Insufficient funds for withdrawal of: " + amount );
            }
        }

        public String getAccountNumber() {
            return accountNumber;
        }
}

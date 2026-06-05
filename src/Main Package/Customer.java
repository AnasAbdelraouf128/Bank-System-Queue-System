//package MainPackage;

public class Customer extends Person {
    private Account account;

    public Customer(String name, String nationalID, String phone, Account account) {
        super(name, nationalID, phone); // Passes data to the abstract Person class
        this.account = account;
    }

    public Account getAccount() { return account; }

    // Fulfilling the abstract method contract
    @Override
    public String getRole() {
        return "Customer";
    }

    // Overriding the interface method to include Account info
    @Override
    public String getDisplayDetails() {
        return super.getDisplayDetails() + " | Account No: " + account.getAccountNumber();
    }
}
   public class customer extends person  {

    private Account account;

    public customer(int id, String name, Account account) {
        super(id, name);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer ID: " + getId() +
               "\nName: " +  +getname()+
               "\nAccount: " + account;
    }
   }

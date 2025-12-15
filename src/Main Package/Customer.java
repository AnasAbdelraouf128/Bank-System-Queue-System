public class Customer extends Person {
    private Account account;

    // FIX: Passing 3 arguments to super(name, id, phone)
    public Customer(String name, String nationalID, String phone, Account account) {
        super(name, nationalID, phone); 
        this.account = account;
    }

    public Account getAccount() { return account; }
    
    @Override
    public String toString() {
        // FIX: Using getNationalID() instead of getId()
        return "Customer ID: " + getNationalID() + " | Name: " + getName(); 
    }

    @Override
    public void printDetails() {
        System.out.println(toString());
    }
}
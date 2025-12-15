
class Customer extends Person {
    
    private Account account;
    public Customer(int id, String name, Account account) {
        super(id, name); 
        this.account = account;
    }
    
    public Customer(String name, String string, String string2, Account newAcc) {
		//TODO Auto-generated constructor stub
	}

	// Getter
    public Account getAccount() {
        return account;
    }
    
    @Override
    public String toString() {
        return "Customer ID: " + getId() + 
               " | Name: " + getName() + 
               " | " + account.toString(); // استدعاء toString() للحساب
    }
}
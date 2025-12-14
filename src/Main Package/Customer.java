public class Customer {
    
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

public class Account {
    class Account {
    private double balance;
    
        
        public Account(double balance) {
        this.balance = balance;
    }
    
    // دالة الإيداع
    public void deposit(double amount) {
        // التصحيح: إضافة المبلغ إلى الرصيد الحالي
        balance += amount; 
    }
    
    // Getter
    public double getBalance() {
        return balance;
    }
    
    @Override
    public String toString() {
        return "Account Balance: " + balance;
    }
}
}

public class Teller extends Person {
    private String employeeID;
    private int experienceYears;

    // FIX: Removed 'void'. Added 5 parameters. Passed 3 to super().
    public Teller(String name, String nationalID, String phone, String employeeID, int experienceYears) {
        super(name, nationalID, phone);
        this.employeeID = employeeID;
        this.experienceYears = experienceYears;
    }

    public String getEmployeeID() { return employeeID; }

    public void serveCustomer(){
        System.out.println("Teller: " + getName() + " is serving.");
    }

    @Override
    public void printDetails() {
        System.out.println("Teller: " + getName());
    }
}
public class Teller extends Person {
    private String employeeID ;
    private int experienceYears ;

    public Teller(String name ,String employeeID, int experienceYears) {
        super(name);
        this.employeeID = employeeID;
        this.experienceYears = experienceYears;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void serveCustomer(){
        System.out.println("Teller : "+getName()+"with ID : "+getEmployeeID()+"  is serving a customer");
    }
}

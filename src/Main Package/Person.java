public abstract class Person implements IDisplayable {
    
    protected String name;
    protected String nationalID;
    protected String phone;

    public Person(String name, String nationalID, String phone) {
        this.name = name;
        this.nationalID = nationalID;
        this.phone = phone;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name; }
    public String getNationalID() {
        return nationalID; }

    // Abstract method enforced by interface
    @Override
    public abstract void printDetails();
}
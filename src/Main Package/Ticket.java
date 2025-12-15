public class Ticket {
    private int ticketNo;
    private int priority;
    private Customer owner;

    // FIX: Filled the empty constructor
    public Ticket(int ticketNo, Customer owner, int priority) {
        this.ticketNo = ticketNo;
        this.owner = owner;
        this.priority = priority;
    }

    public int getTicketNo() { return ticketNo; }
    public int getPriority() { return priority; }
    public Customer getOwner() { return owner; }
}
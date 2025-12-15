import java.util.Scanner;
import java.util.List;

public class Main {
    // Static dependencies
    static QueueManager qManager = new QueueManager();
    static Scanner scanner = new Scanner(System.in);
    static int ticketCounterID = 1;

    public static void main(String[] args) {
        // Setup a dummy teller and counter
        Teller t1 = new Teller("Alice", "E01", "01000", "E01", 5);
        Counter c1 = new Counter(1);
        c1.assignTeller(t1);
// Headers Modification for a better display
        while (true) {
            System.out.println("\n--- Bank Queue System ---");
            System.out.println("1. Add Customer (Take Ticket)");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. Sort Queue (VIP First)");
            System.out.println("4. Search Ticket by ID");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Input Data
                System.out.print("Enter Name: ");
                String name = scanner.next();
                System.out.print("Is VIP? (1=Yes, 0=No): ");
                int isVip = scanner.nextInt();
                int priority = (isVip == 1) ? 2 : 1;

                // Create Objects
                Account newAcc = new Account("ACC" + ticketCounterID, 1000.0);
                Customer newCust = new Customer(name, "ID" + ticketCounterID, "000", newAcc);
                Ticket newTicket = new Ticket(ticketCounterID, newCust, priority);
                
                // Add to Manager
                qManager.addTicket(newTicket);
                ticketCounterID++;

            } else if (choice == 2) {
                Ticket t = qManager.callNext();
                if (t != null) {
                    System.out.println("Serving Ticket #" + t.getTicketNo() + " (" + t.getOwner().getName() + ")");
                } else {
                    System.out.println("Queue is empty.");
                }

            } else if (choice == 3) {
                qManager.sortQueue(); // Calls Member 4's Manual Bubble Sort

            } else if (choice == 4) {
                System.out.print("Enter Ticket ID to search: ");
                int targetID = scanner.nextInt();
                searchTicketManual(targetID); // Calls Member 5's Manual Search

            } else if (choice == 5) {
                break;
            }
        }
    }

    // MANUAL SEARCH ALGORITHM (Linear Search)
    // No list.contains() allowed!
    public static void searchTicketManual(int id) {
        List<Ticket> list = qManager.getList();
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            Ticket t = list.get(i);
            if (t.getTicketNo() == id) {
                System.out.println("Found: Ticket #" + t.getTicketNo() + " belongs to " + t.getOwner().getName());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Ticket #" + id + " not found in queue.");
        }
    }
}
import java.util.*;

public class QueueManager {
    private List<Ticket> waitinglist;

    public QueueManager() {
        waitinglist = new ArrayList<>();
    }

    public void addTicket(Ticket t){
        waitinglist.add(t);
    }

    public void sortQueue(){
        int n = waitinglist.size();
        for(int i=0 ; i < n-1 ; i++){
            for(int j=0 ; j < n-i-1 ; j++){
                Ticket current = waitinglist.get(j);
                Ticket next = waitinglist.get(j+1);

                // FIX: Used '<' for Descending order (VIP first)
                if(current.getPriority() < next.getPriority()){
                    swapTickets(j , j+1);
                } 
                else if (current.getPriority() == next.getPriority() && current.getTicketNo() > next.getTicketNo()) {
                    swapTickets(j, j+1);
                }
            }
        }
        System.out.println("Queue sorted by Priority.");
    }

    private void swapTickets(int n1 , int n2){
        Ticket temp = waitinglist.get(n1);
        waitinglist.set(n1 , waitinglist.get(n2));
        waitinglist.set(n2 , temp);
    }

    public Ticket callNext(){
        if(waitinglist.isEmpty()){
            return null;
        }
        // FIX: Removed "index:" text. It is just remove(0).
        return waitinglist.remove(0);
    }

    public List<Ticket> getWaitingList() {
        return new ArrayList<>(waitinglist);
    }
}
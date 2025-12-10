import java.util.*;
public class QueueManager {
    private List <Ticket> waitinglist ;

    public QueueManager() {
      waitinglist = new ArrayList<>();
    }
    public void addTicket(Ticket t){
        waitinglist.add(t);
    }
    // sorting by buublesort algo. by priority then Id
    // priority and Id get from Ticket class
    public void sortQueue(){
        int n = waitinglist.size();
        for(int i=0 ; i < n-1 ; i++){
            for(int j=0 ; j < n-i-1 ; j++){
                Ticket current = waitinglist.get(j);
                Ticket next = waitinglist.get(j+1);
                if(current.getPriority() > next.getPriority()){
                    swapTickets(j , j+1);
                } else if (current.getPriority() == next.getPriority() && current.getId()> next.getId()) {
                    swapTickets(j,j+1);
                }
            }
        }
    }
    // method for swapping to avoid repeating
    private void swapTickets(int n1 , int n2){
        Ticket temp = waitinglist.get(n1);
        waitinglist.set(n1 , waitinglist.get(n2));
        waitinglist.set(n2 , temp);

    }
    public Ticket callNext(){
        if(waitinglist.isEmpty()){
            return null ;
        }
        return waitinglist.remove(0);
    }
    // for testing
    public List<Ticket> getWaitinglist() {
        return new ArrayList<>(waitinglist) ;
    }
}

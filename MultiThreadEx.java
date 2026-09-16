class TicketBooking{
    int availableTickets = 10;
    synchronized void bookingTickets( String CustomerName, int Tickets){
        System.out.println(CustomerName + " wants to book " + "is booking tickets..");
        if (Tickets <= availableTickets){
            System.out.println(CustomerName + " is booking tickets..");
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        availableTickets -= Tickets;
        System.out.println(CustomerName + " Successfully booked " + Tickets + " Tickets");
        System.out.println("Tickets Remaining :" + availableTickets);
        }else {
            System.out.println(CustomerName + "~ Not Enough Tickets available");
            System.out.println("Tickets Remaining :" + availableTickets);
        }
        System.out.println("---------------------------------------------");
    }
}
class Customer implements Runnable{
    TicketBooking booking;
    String CustomerName;
    int Tickets;
    Customer(TicketBooking booking, String CustomerName, int Tickets){
        this.booking = booking;
        this.CustomerName = CustomerName;
        this.Tickets = Tickets;
    }
    public void run(){
        booking.bookingTickets(CustomerName, Tickets);
    }
}
public class MultiThreadEx {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        Customer c1 = new Customer(booking, "Customer1",4 );
        Customer c2 = new Customer(booking, "Customer2",5 );
        Customer c3 = new Customer(booking, "Customer3",3);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }
}

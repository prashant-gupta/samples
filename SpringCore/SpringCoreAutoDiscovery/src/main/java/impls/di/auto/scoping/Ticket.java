package impls.di.auto.scoping;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 6/7/13
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ticket {
    static int ticketCounter=0;
    int ticketNumber;

    public Ticket(){ticketNumber=ticketCounter++;}

    public String toString(){
        return "Ticket# "+ticketNumber;
    }
}

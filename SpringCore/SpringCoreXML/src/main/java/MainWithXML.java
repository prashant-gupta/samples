import impls.di.xml.factory.Stage;
import impls.di.xml.scoping.Ticket;
import interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static java.lang.System.out;

public class MainWithXML {
    static ApplicationContext context=null;

    public static void main(String... args){

        Performer performer=(Performer) context.getBean("poeticJuggler");
        performer.perform();

        Performer juggler=(Performer) context.getBean("juggler");
        juggler.perform();

        /*Singleton Injection*/
        Stage stage=(Stage)context.getBean("stage");
        out.println("stage == "+stage);
//
        /* Prototype Bean Scope */
        Ticket[] tickets=new Ticket[5];
        for(int i=0;i<tickets.length;i++){
            tickets[i]=(Ticket)context.getBean("ticket");
        }
        out.println("Tickets == "+ Arrays.asList(tickets));

        /* Property injection */
        Performer kenny=(Performer)context.getBean("kenny");
        kenny.perform();

        /*property injection with inner bean*/
        Performer tidyKenny=(Performer)context.getBean("tidyKenny");
        tidyKenny.perform();

        /* wiring collection */
        Performer oneManBand =(Performer)context.getBean("oneManBand");
        oneManBand.perform();
    }

    static {
        context=getApplicationContext();
    }


    static ApplicationContext getApplicationContext(){
        return new ClassPathXmlApplicationContext("spring-config.xml");
    }
}

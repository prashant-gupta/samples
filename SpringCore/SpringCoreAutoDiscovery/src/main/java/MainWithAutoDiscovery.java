import interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 14/7/13
 * Time: 9:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainWithAutoDiscovery {
    static ApplicationContext context=null;

    public static void main(String... args){

//        Performer performer=(Performer) context.getBean("poeticJuggler");
//        performer.perform();
        Performer kenny=(Performer)context.getBean("kenny");
        kenny.perform();
        System.out.println("================");
        Performer tidyInstrumentalist=(Performer)context.getBean("tidyInstrumentalist");
        tidyInstrumentalist.perform();
    }

    static {
        context=getApplicationContext();
    }


    static ApplicationContext getApplicationContext(){
        return new ClassPathXmlApplicationContext("spring-config.xml");
    }
}

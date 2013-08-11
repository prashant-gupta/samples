import interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 13/7/13
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainWithAnnotation {
    static ApplicationContext context=null;

    public static void main(String... args){

        Performer performer=(Performer) context.getBean("poeticJuggler");
        performer.perform();
        Performer kenny=(Performer)context.getBean("kenny");
        kenny.perform();
        Performer annotatedInstrumentalist=(Performer)context.getBean("annotatedInstrumentalist");
        annotatedInstrumentalist.perform();
    }

    static {
        context=getApplicationContext();
    }


    static ApplicationContext getApplicationContext(){
        return new ClassPathXmlApplicationContext("spring-config.xml");
    }
}

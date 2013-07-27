import edu.jft.prashant.wsendpoints.SpitterServiceEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.System.out;

public class JAXWSConsumer {
    static private ApplicationContext ctx;

    public static void main(String... args){
        SpitterServiceEndpoint spitterService=(SpitterServiceEndpoint)ctx.getBean("spitterService");
        out.println("============================="+spitterService.echoUsername("prashant"));

    }

    static {
        ctx= new ClassPathXmlApplicationContext("spring-config.xml");
    }
}

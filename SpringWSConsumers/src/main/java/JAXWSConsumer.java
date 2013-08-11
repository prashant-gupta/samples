import edu.jft.prashant.interfaces.UtilService;
import edu.jft.prashant.services.endpoints.UtilServiceEndpoint;
import edu.jft.prashant.wsendpoints.SpitterServiceEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.management.MBeanServerConnection;

import static java.lang.System.out;

public class JAXWSConsumer {
    static private ApplicationContext ctx;

    public static void main(String... args){
//        UtilService hessianUtilService=(UtilService)ctx.getBean("hessianUtilService");
//        out.println("=============== "+hessianUtilService.echo("prashant"));
//
        UtilService burlapUtilService=(UtilService)ctx.getBean("burlapUtilService");
        out.println("=============== "+burlapUtilService.echo("prashant"));

        UtilService invUtilService=(UtilService)ctx.getBean("invUtilService");
        out.println("============================="+invUtilService.echo("gupta"));

        UtilService jmxUtilService=(UtilService)ctx.getBean("jmxUtilService");
        out.println("============================="+jmxUtilService.echo("JMX"));
        jmxUtilService.setVar(100);

        UtilService rmiUtilService=(UtilService)ctx.getBean("rmiUtilService");
        out.println("============================="+rmiUtilService.echo("local"));

        UtilServiceEndpoint utilService=(UtilServiceEndpoint)ctx.getBean("utilService");
        out.println("============================="+utilService.echo("Hello world !"));

        MBeanServerConnection connection = (MBeanServerConnection) ctx.getBean("jmxServerClient");
        try{
            out.println("============================="+connection.getMBeanCount());
        }catch(Exception e){
            e.printStackTrace();
        }


    }

    static {
        ctx= new ClassPathXmlApplicationContext("spring-config.xml");
    }
}

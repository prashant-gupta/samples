import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import static java.lang.System.out;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 21/7/13
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    static ApplicationContext ctx;

    public static void main(String... args){
        JmsTemplate jmsTemplate=(JmsTemplate)ctx.getBean("jmsTemplate");

    }

    static {
        ctx=new ClassPathXmlApplicationContext("spring-config.xml");
    }


}

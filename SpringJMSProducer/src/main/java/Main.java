import edu.jft.prashant.interfaces.QueueSenderService;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
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

        /* post a message on the queue */
        JmsTemplate jmsTemplate=(JmsTemplate)ctx.getBean("jmsTemplate");

        QueueSenderService queueSender=(QueueSenderService)ctx.getBean("queueProducer");
        ActiveMQTopic topic=(ActiveMQTopic)ctx.getBean("topic");

        //send message over to the QUEUE
        queueSender.sendString("jft.queue","Queue message");

        // send message over to the topic
        jmsTemplate.convertAndSend(topic, "Topic message");
        /* read message from the queue */

        // receive messages
//        getMessage(jmsTemplate,"jft.queue");
//        getMessage(jmsTemplate,topic);

    }

    static {
        System.out.println("========  loading context ======");
        ctx=new ClassPathXmlApplicationContext("spring-config.xml");
    }

    static ObjectMessage getMessage(JmsTemplate jmsTemplate, String destinationName){
        ObjectMessage objectMessage=null;
        try{
            objectMessage = (ObjectMessage)jmsTemplate.receive(destinationName);
            out.println(" ========Message========== "+objectMessage.getObject());
        }catch (JMSException e){
            e.printStackTrace();
        }
        return objectMessage;
    }


    static ObjectMessage getMessage(JmsTemplate jmsTemplate, Destination destination){
        ObjectMessage objectMessage=null;
        try{
            objectMessage = (ObjectMessage)jmsTemplate.receive(destination);
            out.println(" ========Message========== "+objectMessage.getObject());
        }catch (JMSException e){
            e.printStackTrace();
        }
        return objectMessage;
    }
}

package edu.jft.prashant;

import edu.jft.prashant.interfaces.QueueSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 21/7/13
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class QueueProducer implements QueueSenderService {

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendString(String destination,final String message){
        jmsTemplate.send(destination,new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(message);  //To change body of implemented methods use File | Settings | File Templates.
            }
        });
    }

}

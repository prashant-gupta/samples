package edu.jft.prashant;

import org.springframework.stereotype.Component;

/**
 * Created by prashant on 19/3/15.
 */
@Component
public class TopicListenerSlave {
    public void retrieveMessage(Object object){
        System.out.println(" ==== slave read : topic message === "+object.toString());
    }
}

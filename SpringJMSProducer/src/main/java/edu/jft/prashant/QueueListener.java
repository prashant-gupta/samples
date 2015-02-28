package edu.jft.prashant;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 21/7/13
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
@Component(value = "queueListener")
public class QueueListener {

    public void getObject(Object object){
        System.out.println(" ========================== "+object);
    }
}

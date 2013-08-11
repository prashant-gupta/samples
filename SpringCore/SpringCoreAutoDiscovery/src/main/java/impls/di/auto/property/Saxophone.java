package impls.di.auto.property;

import interfaces.Instrument;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 8/7/13
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */

@Component("saxophone")
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Saxophone implements Instrument {
    static int objectCounter=0;
    private final int objectId;

    public Saxophone(){
        objectId=objectCounter++;
    }

    public int getObjectId(){
        return this.objectId;
    }
    @Override
    public void play() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("TOOT TOOT TOOT...3");
        System.out.println("object id: "+getObjectId());
    }
}

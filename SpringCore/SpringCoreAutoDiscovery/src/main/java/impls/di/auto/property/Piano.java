package impls.di.auto.property;

import interfaces.Instrument;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 8/7/13
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Component("piano")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Piano implements Instrument {
    @Override
    public void play() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("PLINK PLINK PLINK...");
    }
}

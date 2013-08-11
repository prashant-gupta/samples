package impls.di.annotation.property;

import interfaces.Instrument;

import javax.inject.Provider;


/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 8/7/13
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Piano implements Instrument, Provider<Piano> {
    @Override
    public void play() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("PLINK PLINK PLINK...");
    }

    public Piano get(){
        return this;
    }
}

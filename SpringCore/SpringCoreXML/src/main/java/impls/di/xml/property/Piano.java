package impls.di.xml.property;

import interfaces.Instrument;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 8/7/13
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Piano implements Instrument {
    @Override
    public void play() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("PLINK PLINK PLINK...");
    }
}

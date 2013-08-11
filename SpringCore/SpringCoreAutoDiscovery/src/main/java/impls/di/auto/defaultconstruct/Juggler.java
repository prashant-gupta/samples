package impls.di.auto.defaultconstruct;

import interfaces.Performer;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 1/7/13
 * Time: 12:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Juggler implements Performer {

    private int bags=3;

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public Juggler(){}

    public Juggler(int bags){
        this.setBags(bags);
    }

    public void perform(){
        System.out.println(" juggler performing with "+this.getBags()+" bags......");
    }
}

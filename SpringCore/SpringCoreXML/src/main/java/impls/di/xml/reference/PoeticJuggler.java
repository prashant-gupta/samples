package impls.di.xml.reference;

import impls.di.xml.defaultconstruct.Juggler;
import interfaces.Poem;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 2/7/13
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class PoeticJuggler extends Juggler {

    private Poem poem;

    public Poem getPeom() {
        return poem;
    }

    public void setPeom(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(){}

    public PoeticJuggler(Poem poem){
        this.setPeom(poem);
    }
    public PoeticJuggler(Poem poem,int bags){
        super(bags);
        this.setPeom(poem);
    }

    public void perform(){
        super.perform();
        System.out.println("and singing...... ");
        this.getPeom().recite();
    }
}

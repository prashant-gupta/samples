package impls.di.annotation.reference;

import impls.di.annotation.defaultconstruct.Juggler;
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

    public Poem getPoem() {
        return poem;
    }

    public void setPoem(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(){}

    public PoeticJuggler(Poem poem){
        this.setPoem(poem);
    }
    public PoeticJuggler(Poem poem,int bags){
        super(bags);
        this.setPoem(poem);
    }

    public void perform(){
        super.perform();
        System.out.println("and singing...... ");
        this.getPoem().recite();
    }
}

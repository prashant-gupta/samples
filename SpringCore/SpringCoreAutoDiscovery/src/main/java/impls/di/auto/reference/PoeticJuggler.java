package impls.di.auto.reference;

import impls.di.auto.defaultconstruct.Juggler;
import interfaces.Poem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 2/7/13
 * Time: 10:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class PoeticJuggler extends Juggler {

    @Autowired
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

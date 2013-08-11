package impls.di.annotation.reference;

import impls.di.annotation.property.Piano;
import interfaces.Instrument;
import interfaces.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 8/7/13
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class InstrumentalistAnnotated implements Performer{

    @Value("Random Song")
    private String song;
    private Instrument instrument;
    private int age;
    private Collection<Piano> pianos;

    @Autowired
    @Qualifier("saxophone")
    private Instrument instrumentB;

    @Inject
    @Named("saxophone")
    private Instrument instrumentC;

    public InstrumentalistAnnotated() {
    }

    @Autowired
    public InstrumentalistAnnotated(Instrument instrument){
        this.setInstrument(instrument);
    }

    public Collection<Piano> getPianos() {
        return pianos;
    }

    /* lazy injection using provider interface */
    @Inject
    @Named("pianoProvider")
    public void setPianos(Provider<Piano> pianos) {
        this.pianos=new HashSet<Piano>();
        for (int i=0;i<3;i++){
            this.pianos.add(pianos.get());
        }
    }

    public int getAge() {
        return age;
    }

    @Value("20")
    public void setAge(int age) {
        this.age = age;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() throws RuntimeException {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Kenny aged: "+age+" performing...");
        getInstrument().play();
        instrumentB.play();
        instrumentC.play();

        System.out.println("and singing... ");
        for (Piano p:pianos){
            p.play();
        }
        System.out.println("and singing "+getSong()+"...");
    }
}

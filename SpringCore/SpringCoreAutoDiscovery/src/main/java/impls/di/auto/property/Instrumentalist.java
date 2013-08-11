package impls.di.auto.property;

import interfaces.Instrument;
import interfaces.Performer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 8/7/13
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */

@Component("kenny")
public class Instrumentalist implements Performer{
    @Value("Baba Baba Black sheep...")
    private String song;
    @Inject
    @Named("saxophone")
    private Instrument instrument;
    @Value("20")
    private int age;

    public Instrumentalist() {
    }

    public Instrumentalist(Instrument instrument){
        this.setInstrument(instrument);
    }

    public int getAge() {
        return age;
    }

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
        System.out.println("Kenny performing...");
        getInstrument().play();
        System.out.println("and singing "+getSong()+"...");
    }
}

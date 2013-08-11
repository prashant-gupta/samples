package impls.di.xml.property;

import interfaces.Instrument;
import interfaces.Performer;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 8/7/13
 * Time: 11:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class TidyInstrumentalist implements Performer {
    private String song;
    private Instrument instrument;
    private int age;

    public TidyInstrumentalist() {
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
        System.out.println("I like tidy things... ");
        getInstrument().play();
        System.out.println("and singing "+getSong()+"...");
    }
}

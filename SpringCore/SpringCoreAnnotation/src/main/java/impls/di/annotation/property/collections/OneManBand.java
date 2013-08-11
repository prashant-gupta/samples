package impls.di.annotation.property.collections;

import interfaces.Instrument;
import interfaces.Performer;

import java.util.Collection;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 9/7/13
 * Time: 12:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class OneManBand implements Performer{

    private Collection<Instrument> instruments;
    private Map<String,Instrument> namedInstruments;
    private Collection<String> songs;

    public OneManBand(){}


    private void start(){
        System.out.println("===== starting one man band =======");
    }
    private void stop(){
        System.out.println("===== stop =======");
    }

    public Map<String, Instrument> getNamedInstruments() {
        return namedInstruments;
    }

    public void setNamedInstruments(Map<String, Instrument> namedInstruments) {
        this.namedInstruments = namedInstruments;
    }

    public Collection<String> getSongs() {
        return songs;
    }

    public void setSongs(Collection<String> songs) {
        this.songs = songs;
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws RuntimeException {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("this is one man band.... ");
        for (Instrument i:getInstruments()){
            i.play();
        }
        for (String s:getSongs()){
            System.out.println("singing "+s+".... ");
        }
        for(Map.Entry<String,Instrument> e:namedInstruments.entrySet()){
            System.out.println("named instrument .. "+e.getKey());
            e.getValue().play();
        }
    }
}

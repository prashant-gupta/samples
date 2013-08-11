package impls.di.xml.reference;

import interfaces.Poem;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 2/7/13
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimplePoem implements Poem {
    String poem="baba baba black sheep";

    public void recite(){
        System.out.println(poem);
    }
}

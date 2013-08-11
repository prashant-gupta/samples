package impls.di.auto.reference;

import interfaces.Poem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 2/7/13
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class SimplePoem implements Poem {

    @Value(value = "Hello Spring World !")
    String poem;

    public void recite(){
        System.out.println(poem);
    }
}

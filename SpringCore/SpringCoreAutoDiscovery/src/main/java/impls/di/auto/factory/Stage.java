package impls.di.auto.factory;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 6/7/13
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */

@Component("stage")
public class Stage {
    private Stage(){}

    private static class StageSingletonHolder{
        static Stage instance=new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }

    public String toString(){
        return "MainWithXML Stage";
    }
}

package edu.jft.prashant.wsendpoints;

import edu.jft.prashant.services.SpitterServiceImpl;
import interfaces.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 21/7/13
 * Time: 4:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
@WebService(serviceName = "SpitterService")
public class SpitterServiceEndpoint {

    @Autowired
    private SpitterService spitterService;

    @WebMethod
    public String getUsername(){
        return spitterService.getUsername();
    }

    @WebMethod
    public String echoUsername(String name){
        return spitterService.echoUsername(name);
    }
}

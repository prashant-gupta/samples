package edu.jft.prashant.services.endpoints;

import edu.jft.prashant.services.UtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 27/7/13
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
@WebService(serviceName = "UtilService")
public class UtilServiceEndpoint {

    @Autowired
    private UtilServiceImpl utilService;

    @WebMethod
    public String echo(String message){
        return  utilService.echo(message);
    }
}

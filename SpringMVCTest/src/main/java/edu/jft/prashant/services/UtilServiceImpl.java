package edu.jft.prashant.services;

import edu.jft.prashant.interfaces.UtilService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 27/7/13
 * Time: 6:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UtilServiceImpl implements UtilService{

    @Override
    public String echo(String message){
        System.out.println("================== message ========== "+message);
        return message;
    }
}

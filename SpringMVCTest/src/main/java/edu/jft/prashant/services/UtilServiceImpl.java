package edu.jft.prashant.services;

import edu.jft.prashant.interfaces.UtilService;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 27/7/13
 * Time: 6:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
@ManagedResource(objectName = "JFTTest:name=UtilServiceImpl")
public class UtilServiceImpl implements UtilService{
    private int var;

    @ManagedAttribute
    public int getVar() {
        return var;
    }
    @ManagedAttribute
    public void setVar(int var) {
        this.var = var;
    }

    @Override
    @ManagedOperation
    public String echo(String message){
        System.out.println("================== var ========== "+getVar());
        System.out.println("================== message ========== "+message);
        return message;
    }
}

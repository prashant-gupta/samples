package edu.jft.prashant.services;

import interfaces.SpitterService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: edu.jft.prashant
 * Date: 20/7/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class SpitterServiceImpl implements SpitterService{

    public String getUsername(){
        System.out.println("============ getUsername =================");
        return "prashant";
    }

    public String echoUsername(String name){
        System.out.println("============ echoUsername ================="+name);
        return name;
    }

}

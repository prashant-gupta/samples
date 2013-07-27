package edu.jft.prashant.controllers;

import edu.jft.prashant.services.SpitterServiceImpl;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 20/7/13
 * Time: 11:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller("spitter")
@RequestMapping("/spitters")
public class SpitterController implements BeanNameAware{
    private final SpitterServiceImpl spitterServiceImpl;
    private String viewDir;

    @Autowired
    public SpitterController(SpitterServiceImpl spitterServiceImpl){
        this.spitterServiceImpl = spitterServiceImpl;
    }

    @RequestMapping(value = "/spittles",method = RequestMethod.GET)
    public String listSpittlesForSpitter(
            @RequestParam("spittle")String username, Model model
    ){
        System.out.println(" =======username========== "+username);
        model.addAttribute("username",username);
        return viewDir+"list";
    }

    @Override
    public void setBeanName(String name) {
        this.viewDir=name+"/";
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

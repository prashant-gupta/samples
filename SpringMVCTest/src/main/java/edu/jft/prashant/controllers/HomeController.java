package edu.jft.prashant.controllers;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: prashant
 * Date: 27/7/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping({"/"})
public class HomeController implements BeanNameAware {

    private String viewsDir;


    @RequestMapping({"/","/home"})
    public String showHome(Model model){

        model.addAttribute("username","prashant");
        return viewsDir+"home";
    }

    @Override
    public void setBeanName(String name) {
        this.viewsDir=name+"/";
    }
}

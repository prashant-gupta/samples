package edu.jft.prashant.controllers;

import edu.jft.prashant.services.SpitterServiceImpl;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static java.lang.System.out;

/**
 * Created with IntelliJ IDEA.
 * User: edu.jft.prashant
 * Date: 20/7/13
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller("home")
@ManagedResource(objectName = "spitter:name=HomeController")
public class HomeController implements BeanNameAware{
    public static final int DEFAULT_SPITTLES_PER_PAGE=25;
    private String viewsDirectory;

    private SpitterServiceImpl spitterServiceImpl;

    @Autowired
    public HomeController(SpitterServiceImpl spitterServiceImpl){
        this.spitterServiceImpl = spitterServiceImpl;
    }

    @ManagedAttribute
    public String getViewsDirectory(){
        return this.viewsDirectory;
    }

    @Override
    @ManagedAttribute
    public void setBeanName(String name) {
        out.println("===== name ===== "+name);
        this.viewsDirectory=name+"/";
    }

    @RequestMapping({"/","/home"})
    public String showHomePage(Map<String,Object> model){
        List<String> a=new ArrayList<String>();
        a.add("bla bla");
        model.put("spittles", a);
        return (viewsDirectory+"home");
    }


}

package com.jft.prashant;

import com.jft.prashant.dao.UserEmpDAO;
import com.jft.prashant.domain.Employee;
import com.jft.prashant.domain.User;
import com.jft.prashant.rmo.EmployeeRMO;
import com.jft.prashant.rmo.UserRMO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import static java.lang.System.out;

/**
 * Created by prashant on 24/5/14.
 */
public class Main {

    public static void main(String... args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        UserEmpDAO userEmpDAO = (UserEmpDAO) ctx.getBean("userEmpDao");

        Map result = userEmpDAO.getUserAndEmployeeData(0);

        /* let's print the users' usernames from the result*/
        List users  = (List)result.get(UserRMO.RESULT_SET);
        for (Object o : users){
            out.println("ID: "+((User)o).getId()+" Username: "+((User)o).getUsername());
        }

        /* let's print the employees' depts from the result*/
        List employees  = (List)result.get(EmployeeRMO.RESULT_SET);
        for (Object o : employees){
            out.println("ID: "+((Employee)o).getId()+" Dept: "+((Employee)o).getDept());
        }
    }
}

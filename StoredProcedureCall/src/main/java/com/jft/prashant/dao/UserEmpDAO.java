package com.jft.prashant.dao;

import com.jft.prashant.sproc.UserEmpSProc;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by prashant on 20/5/14.
 */
public class UserEmpDAO extends GenericDAO{

    private UserEmpSProc userEmpSProc;

    public List getSampleData(){
        String QUERY = " SELECT * from user ";
        return jdbcTemplate.queryForList(QUERY);
    }

    public Map getUserAndEmployeeData(Integer id){
        return userEmpSProc.getUserAndEmpData(id);
    }

    public void setUserEmpSProc(UserEmpSProc userEmpSProc) {
        this.userEmpSProc = userEmpSProc;
    }
}

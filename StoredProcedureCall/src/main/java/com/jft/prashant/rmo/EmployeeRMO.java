package com.jft.prashant.rmo;

import com.jft.prashant.domain.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by prashant on 24/5/14.
 */
public class EmployeeRMO implements RowMapper<Employee>{

    public static final String RESULT_SET = "RESULT_SET2";

    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee emp = new Employee();

        emp.setId(rs.getLong("ID"));
        emp.setDept(rs.getString("DEPT"));

        return emp;
    }
}

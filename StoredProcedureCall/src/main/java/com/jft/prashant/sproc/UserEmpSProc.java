package com.jft.prashant.sproc;

import com.jft.prashant.rmo.EmployeeRMO;
import com.jft.prashant.rmo.UserRMO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by prashant on 20/5/14.
 */
public class UserEmpSProc extends StoredProcedure {

    public UserEmpSProc(JdbcTemplate jdbcTemplate){
        super(jdbcTemplate, "select_all_from_user_emp");

        declareParameter(new SqlReturnResultSet(UserRMO.RESULT_SET, new UserRMO()));
        declareParameter(new SqlReturnResultSet(EmployeeRMO.RESULT_SET ,new EmployeeRMO()));

        declareParameter(new SqlParameter("ID", Types.INTEGER));
        compile();
    }

    public Map<String,Object> getUserAndEmpData(Integer id){
        Map<String,Object> paramsMap = new HashMap<String,Object>();
        paramsMap.put("ID",id);

        return execute(paramsMap);
    }
}

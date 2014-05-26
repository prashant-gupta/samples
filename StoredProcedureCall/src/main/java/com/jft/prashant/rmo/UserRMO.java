package com.jft.prashant.rmo;

import com.jft.prashant.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by prashant on 24/5/14.
 */
public class UserRMO implements RowMapper<User>{

    public static final String RESULT_SET = "RESULT_SET1";

    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();

        user.setId(rs.getLong("ID"));
        user.setUsername(rs.getString("USERNAME"));
        user.setFirstName(rs.getString("FIRSTNAME"));
        user.setLastName(rs.getString("LASTNAME"));
        user.setPassword(rs.getString("PWD"));
        user.setDateCreated(rs.getDate("DATECREATED"));

        return user;
    }
}

package demo.jdbc.service.impl;

import demo.jdbc.service.JDBCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @create: 2020-03-30 15:37
 **/
@Service
public class JDBCServiceImpl implements JDBCService {
    @Autowired
    private JdbcTemplate  jdbcTemplate;

    public boolean addUser(String userName,Integer age){
        int insertUser=jdbcTemplate.update("insert into users values(null,?,?);", userName, age);
        return insertUser >0 ? true : false;
    }
}

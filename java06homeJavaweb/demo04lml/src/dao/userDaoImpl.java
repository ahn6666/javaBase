package dao;

import domain.product;
import domain.user;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.jdbcUtils;

import java.util.List;

public class userDaoImpl implements userDao{
    private JdbcTemplate jdbcTemplate=  new JdbcTemplate(jdbcUtils.getDataSource());

    @Override
    public user findByUser(String name, String password) {
        String sql="select *from user where name=? and password=?";
        try {
            user user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(user.class), name, password);
            return user;
        }catch (Exception e)
        {
            return null;
        }

    }

    @Override
    public void addUser(String name, String password) {
        String sql="insert into user values(?,?)";
        jdbcTemplate.update(sql,name,password);
    }
}

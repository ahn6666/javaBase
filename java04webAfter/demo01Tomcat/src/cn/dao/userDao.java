package cn.dao;


import cn.user.User;
import cn.utils.druidUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class userDao{
    //声明jdbc 对象公用
    private JdbcTemplate temp=new JdbcTemplate(druidUtils.getDataSource());
    //操作数据库表的类，为了方便增删改查
    public User login(User loginuser)
    {
        /**
         * 登录方法
         * @param 只有用户名和密码
         * @return user 包含用户的全部信息
         */
        try {
            String sql="select *from user where username= ? and password = ? ";
            User user = temp.queryForObject(sql,
                    new BeanPropertyRowMapper<>(User.class),
                    loginuser.getUsername(), loginuser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.druidUtils;

public class JDBCTemplatedemo01 {
    public static void main(String[] args) {
        //创建jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(druidUtils.getDataSource());
        //创建sql对象
        String sql="update stu2 set phone = phone+500 where id =?";
        int i = jdbcTemplate.update(sql, 1);
        System.out.println(i);
    }
}

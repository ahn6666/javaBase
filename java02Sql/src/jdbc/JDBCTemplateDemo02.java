package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.druidUtils;

public class JDBCTemplateDemo02 {
    public static void main(String[] args) {
        //创建JdbcTemplate
        JdbcTemplate jd= new JdbcTemplate(druidUtils.getDataSource());
        //设置sql语句
      /*  //更改一条记录
        String sql="update staff set age=1000 where num= ?";
        int i = jd.update(sql, 1);
        //添加一条数据
        String sql1="insert into staff values(null,'孟玲',29,2)";
        int j = jd.update(sql1);
        System.out.println("更新" +i +"添加"+j);*/
       /* String sql2="delete from staff where num=14 ";
        jd.update(sql2);*/

    }
}

package jdbc;


import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.druidUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo03 {
    private JdbcTemplate jd = new JdbcTemplate(druidUtils.getDataSource());
    @Test
    public void demoadd()
    {

        String sql="update stu2 set phone=2000 where num= ?";
        int i = jd.update(sql, 1);
        System.out.println(i);
    }
    @Test
    public void map()
    {
        String sql="select  *from stu2 where  id=1";
        Map<String, Object> map = jd.queryForMap(sql);
        //只适合用于1条查询
        System.out.println(map);
    }
    @Test
    public  void list1()
    {
        String sql="select *from staff where id=3 or id=4";
        List<emp> list = jd.query(sql, new RowMapper<emp>() {
            @Override
            public emp mapRow(ResultSet rs, int i) throws SQLException {
                emp emp = new emp();
                int num = rs.getInt("id");
                int age = rs.getInt("phone");
                String name = rs.getString("name");


                emp.setAge(age);
                emp.setName(name);
                emp.setNum(num);
                return emp;
            }
        });
        for (jdbc.emp emp :
                list)
        {
            System.out.println(emp);

        }

    }

    @Test
    public  void list()
    {
        String sql="select *from staff where num=1 or num=2";
        List<emp> list = jd.query(sql, new BeanPropertyRowMapper<emp>(emp.class));
        for (jdbc.emp emp: list) {
            System.out.println(emp);
        }
    }

    @Test
    public  void query()
    {
        String sql="select count(age) from staff";
        Long i = jd.queryForObject(sql, long.class);
        System.out.println(i);
    }
}

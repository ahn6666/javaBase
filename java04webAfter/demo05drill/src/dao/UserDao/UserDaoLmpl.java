package dao.UserDao;

import domain.user;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utls.JDBCUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoLmpl  implements  UserDao{
    /**
     * 使用jdbc来操作数据库
     * @return
     */
          private  JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());



    @Override
    public List<user> findAll() {
        String sql="SELECT * FROM USER";
        List<user> users =jdbcTemplate.query(sql,new BeanPropertyRowMapper<user>(user.class));
        return users;
    }

    @Override
    public user finduserDaoByuserAndpassword(String username, String password) {
        String sql="select * from user where username= ? and password = ? ";
        try {

            user users = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<user>(user.class),username,password);

            return users;
        }catch (Exception e)
        {

            e.printStackTrace();
            return null;
        }
    }
    @Override
    public void add(user user) {
        String sql="INSERT INTO USER VALUES(NULL,?,?,?,?,?,?,NULL,NULL)";
        jdbcTemplate.update(sql,user.getName(),user.getGender(),user.getAge(),user.getAddress(), user.getQq(),user.getEmail());
    }

    @Override
    public void delectId(int id) {
        String sql="delete from user where id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public user findId(int id) {
        String sql="select *from user where id =?";
        user users = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<user>(user.class), id);
        return users;
    }

    @Override
    public void updateById(user user) {
        String sql="update user set name=?," +
                "gender=?," +
                "age=?," +
                "address=?," +
                "qq=?," +
                "email=?" +
                "where id=?";
        jdbcTemplate.update(sql,user.getName(),user.getGender(),user.getAge(),user.getAddress(), user.getQq(),user.getEmail(),user.getId());

    }

    @Override
    public int finTotalCount(Map<String, String[]> condition) {
        //含有条件的查询
        String sql="select count(*) from user where 1 = 1";
        StringBuilder sb = new StringBuilder(sql);
        List<Object> parames = new ArrayList<Object>();
        //遍历map
        Set<String> keySet = condition.keySet();
        for (String key : keySet) {
            //获取值

            //判断不为空
            if ("currentPage".equals(key)||"rows".equals(key))
            {
                continue;
            }
            String value = condition.get(key)[0];
            if (value!=null && !"".equals(value) )
            {

                sb.append(" and "+key+" like ?");
                parames.add("%"+value+"%");
            }
        }


        int count = jdbcTemplate.queryForObject(sb.toString(),Integer.class,parames.toArray());
        return count;
    }

    @Override

    public List finfByPage(Map<String, String[]> condition, int start, int rows) {
        String sql="select *from user where 1=1";
        StringBuilder sb = new StringBuilder(sql);
        List<Object> parames = new ArrayList<Object>();
        //遍历map
        Set<String> keySet = condition.keySet();
        for (String key : keySet) {
            //获取值

            //判断不为空
            if ("currentPage".equals(key)||"rows".equals(key))
            {
                continue;
            }
            String value = condition.get(key)[0];
            if (value!=null && !"".equals(value) )
            {

                sb.append(" and "+key+" like ?");
                parames.add("%"+value+"%");
            }

        }
        sb.append(" limit ?,?");
        parames.add(start);
        parames.add(rows);
        System.out.println(sb.toString());
        System.out.println(parames);
        return jdbcTemplate.query(sb.toString(),new BeanPropertyRowMapper<user>(user.class),parames.toArray());
    }


}



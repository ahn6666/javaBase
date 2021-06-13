package demo;

import practice.emp;
import practice.jbd8;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class one03 {
    public static void main(String[] args) {
        List<emp> all = new jbd8().findALL();
        System.out.println(all);
    }

    /**
     * 演示jdbc的工具类
     * @return
     */
    public List<emp> findALL() {
        Connection con = null;
        ResultSet rs = null;
        Statement state = null;
        emp emp = null;
        ArrayList<practice.emp> list = new ArrayList<>();
        try {
            //注册驱动
            //获取连接
            con =JDBCUtils.getConnection();
            //获取执行对象
            state = con.createStatement();
            //定义sql
            String sql = "select *from stu";
            //执行结果集
            rs = state.executeQuery(sql);
            //遍历结果集，封装对象，装载集合
            while (rs.next()) {
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                int id = rs.getInt("id");
                int money = rs.getInt("money");
//                System.out.println(id+"-"+name +"-"+sex+"-"+age+"-"+money);
                //创建emp对象
                emp = new emp();
                emp.setAge(age);
                emp.setId(id);
                emp.setName(name);
                emp.setSex(sex);
                emp.setMoney(money);
                list.add(emp);
            }
        } catch ( SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(state, con, rs);

        }
        return  list;
    }

}

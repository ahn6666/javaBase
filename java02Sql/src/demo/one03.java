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
     * ��ʾjdbc�Ĺ�����
     * @return
     */
    public List<emp> findALL() {
        Connection con = null;
        ResultSet rs = null;
        Statement state = null;
        emp emp = null;
        ArrayList<practice.emp> list = new ArrayList<>();
        try {
            //ע������
            //��ȡ����
            con =JDBCUtils.getConnection();
            //��ȡִ�ж���
            state = con.createStatement();
            //����sql
            String sql = "select *from stu";
            //ִ�н����
            rs = state.executeQuery(sql);
            //�������������װ����װ�ؼ���
            while (rs.next()) {
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                int id = rs.getInt("id");
                int money = rs.getInt("money");
//                System.out.println(id+"-"+name +"-"+sex+"-"+age+"-"+money);
                //����emp����
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

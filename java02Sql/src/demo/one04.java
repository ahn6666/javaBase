package demo;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class one04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入账号");
        String account = scan.next();
        System.out.println("请输入密码");
        String password = scan.next();
        boolean log=new one04(). methon(account, password);
        if(log==true)
        {
            System.out.println("登录成功");
        }
        else
        {
            System.out.println("登录失败");
        }
    }


    public static boolean methon(String account, String password)
    {
        if (account==null||password==null)
        {
            return false;
        }
        Connection conn=null;
        Statement state=null;
        ResultSet rs=null;
        //先获取连接
        try {
             conn = JDBCUtils.getConnection();
            //创建sql语句
            String sql="select *from db3 where account = '"+account+"' and password ='"+password+"'";
            //获取对象
            state = conn.createStatement();
            //执行结果集
             rs = state.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(state,conn,rs);
        }

        return false;
    }
}




package demo;

import java.sql.*;

public class one02 {
    public static void main(String[] args)  {
        Statement state=null;
        Connection conn=null;
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql:///db2?useSSL=false&serverTimezone=UTC","root","admin");
//            String sql="insert into pay values(null,'小王',2000)"; --添加数据
//            String sql="delete from pay where  id=4";  --删除数据
            //定义sql resultSet
            String sql="select  * from pay";
            //获取执行对象
             state = conn.createStatement();
             //执行s'q'l
//            int i = state.executeUpdate(sql);
            rs = state.executeQuery(sql);
            //让鼠标下一行
          while (rs.next()){
              int id = rs.getInt(1);
              String name = rs.getString("name");
              double money = rs.getDouble(3);
              System.out.println("id"+id+"name"+name+"money"+money);
          }
             //获取数据



//            if(i>0)
//            {
//                System.out.println("添加成功");
//            }else{
//                System.out.println("添加失败");
//            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs!=null)
            {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn!=null)
            {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (state!=null)
            {
                try {
                    state .close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }

    }
}

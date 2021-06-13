package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class one01 {

        public static void main(String[] args) throws Exception {
            //可以省略的
///            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn= DriverManager.getConnection
//                    ("jdbc:mysql://localhost:3306/db2?useSSL=false&serverTimezone=UTC","root","admin");
            Connection conn= DriverManager.getConnection
                    ("jdbc:mysql:///db2?useSSL=false&serverTimezone=UTC","root","admin");
            String sql="update pay set money = 1500 ";
            Statement stmt=conn.createStatement();
            int count =stmt.executeUpdate(sql);
            System.out.println(count);
            stmt.close();
            conn.close();

//           试运行
        //  Class.forName("com.mysql.cj.jdbc.Driver");
//          Class.forName("com.mysql.jdbc.Driver");
          // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useSSL=false&serverTimezone=UTC","root","admin");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_demo","root","password");
        }
    }



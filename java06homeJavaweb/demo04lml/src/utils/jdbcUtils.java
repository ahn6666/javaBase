package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcUtils {
         private static  DataSource ds ;
         //加载配置文件
        static {
            try {
                //获取配置文件
                Properties pro = new Properties();
                InputStream is = jdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
                //加载配置文件
                pro.load(is);
                //获取连接,通过建造工厂类来创建对象
                 ds= DruidDataSourceFactory.createDataSource(pro);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        //获取连接池对象
        public static DataSource getDataSource(){

            return ds;
        }
        //获取连接
        public static Connection getCon() throws SQLException {
            return  ds.getConnection();
        }

    // 5.定义关闭资源的方法
    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {}
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {}
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {}
        }
    }

    // 6.重载关闭方法
    public static void close(Connection conn, Statement stmt) {
        close(conn, stmt, null);
    }
}




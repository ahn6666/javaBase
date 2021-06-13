package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class druidUtils{
    private static DataSource ds;
    //设置静态代码块
    static{
        //加载配置文件
        Properties pro = new Properties();
        try {
            pro.load(druidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            try {
                 ds = DruidDataSourceFactory.createDataSource(pro);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取连接
    public static Connection getConnection() throws SQLException {
        return  ds.getConnection();
    }
    //关闭 重载
    public static void close(Statement state,Connection conn)
    {
       /* if (state!=null)
        {

            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null)
        {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
        close(null,state,conn);
    }

    public  static  void close(ResultSet rs,Statement state, Connection conn)
    {
        if (rs!=null)
        {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (state!=null)
        {
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null)
        {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static  DataSource getDataSource()
    {
        return ds;
    }
}

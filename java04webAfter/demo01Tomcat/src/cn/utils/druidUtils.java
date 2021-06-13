package cn.utils;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//jdbc工具类 durid连接池
public class druidUtils {
    private static DataSource ds;
    //设置静态代码块
    static{
        //加载配置文件
        Properties pro = new Properties();
        try {
            //初始化连接池
            InputStream rs = druidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(rs);
            try {
                 ds = DruidDataSourceFactory.createDataSource(pro);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取连接池对象
    public static  DataSource getDataSource()
    {
        return ds;
    }
    //获取连接connection对象
    public static Connection getConnection() throws SQLException {
        return  ds.getConnection();
    }
}

package druid;



import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class druid01 {
    public static void main(String[] args) throws Exception {
        //导入jar 包
        //定义配置文件
        //加载配置文件
        Properties pro = new Properties();
        InputStream rs = druid01.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(rs);
        //获取数据库连接池对象：通过工厂来获取 DruidDataSourceFactory
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        //获取连接
        for (int i = 0; i <=10 ; i++) {

            Connection connection = dataSource.getConnection();
            System.out.println(i+":"+connection);
            if (i==5)
            {
                connection.close();
            }
        }


    }
}

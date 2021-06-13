package dao;

import java.sql.*;

public class jdbcDao {
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql:///shcool?useSSL=false&serverTimezone=UTC";
    private final String username = "root";
    private final String password = "admin";

    //	提取重复性的代码，供dao去调用
//	链接数据库的方法
    public Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    //	查询的方法 返回值 ：结果集ResultSet
    public ResultSet executeQuery(Connection conn, String sql, PreparedStatement ps, Object[] params) {
//		获得链接，拿到语句执行对象，传递sql语句和参数，执行sql,得到返回的结果集
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
//			参数的个数不确定
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            rs = ps.executeQuery();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    //	修改，删除，添加的方法  返回值：int   参数
    public int executeUpdate(Connection conn, String sql, PreparedStatement ps, Object[] params) {
//		获得链接，拿到语句执行对象，传递sql语句和参数，执行sql,得到返回的结果集
        int j = 0;
        try {
            ps = conn.prepareStatement(sql);
//			参数的个数不确定
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            j = ps.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return j;
    }


    //	关闭数据库的方法  Connection   PreparedStatement ResultSet
    public void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
package druid;

import utils.druidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class druid02 {
    //获取连接方法，通过数据库连接池连接对像
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement state=null;
        try {
             con = druidUtils.getConnection();
             String sql="insert into stu1 values(?,?)";
             state=con.prepareStatement(sql);
             state.setString(2,"规定");
             state.setDouble(1,2000);

             state.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            druidUtils.close(state,con);
        }
    }
}

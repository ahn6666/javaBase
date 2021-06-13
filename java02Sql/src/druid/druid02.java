package druid;

import utils.druidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class druid02 {
    //��ȡ���ӷ�����ͨ�����ݿ����ӳ����Ӷ���
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement state=null;
        try {
             con = druidUtils.getConnection();
             String sql="insert into stu1 values(?,?)";
             state=con.prepareStatement(sql);
             state.setString(2,"�涨");
             state.setDouble(1,2000);

             state.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            druidUtils.close(state,con);
        }
    }
}

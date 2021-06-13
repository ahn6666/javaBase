package demo;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class one06 {
    public static void main(String[] args) {
        Connection con=null;

        PreparedStatement pre2=null;
        PreparedStatement pre1=null;
        try {
            //获取连接
            con = JDBCUtils.getConnection();

            //进行事务的开启  m默认值为false 如果中间有事务不成功 则整个代码不执行
            con.setAutoCommit(false);
            //更新sql
               String  sql1="update  pay  set money=money- ? where id= ?";
                String sql2="update  pay  set money=money + ? where id=?";
            //获取对象
           pre1 = con.prepareStatement(sql1);
           pre2 = con.prepareStatement(sql2);
            //执行给？赋值
            pre1.setInt(1,500);
            pre1.setInt(2,1);
            pre2.setInt(1,500);
            pre2.setInt(2,2);

            pre1.executeUpdate();

            //假设有个错误 只会改变一个 并且idea  这时就需要事务的回滚
            //int i=3/0;
            pre2.executeUpdate();
            //进行事务的提交
            con.commit();
        } catch (SQLException e) {
            //进行事务的回滚
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pre1,con);
            JDBCUtils.close(pre2,con);
        }

    }
}




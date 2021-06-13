package dao;

import domain.product1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productDao {

    public static void main(String[] args) {
        new productDao().selectAll();

        //		测试查询一条数据
//		product1 p =  new productDao().selectOne(2);
//		System.out.println("p:"+p);
//		测试修改数据
//        product1 p = new product1();
//        p.setId(1);
//        p.setPname("kh");
//        p.setPprice(100);
//        new productDao().updateProduct(p);
//		测试删除
//		new productDao().deleteProduct(3);
//		测试添加
	/*	product1 p = new product1();
		p.setPname("王八");
		p.setPprice(3);
		new productDao().insertProduct(p);*/

    }


    jdbcDao baseDao = new jdbcDao();
    //	查询全部
    public List<product1> selectAll(){
        List<product1> list = new ArrayList<product1>();
        ResultSet rs = null;
        Connection conn = baseDao.getConn();
        PreparedStatement ps = null;
        String sql = "SELECT *FROM product";
        Object[] params = {};
        rs = baseDao.executeQuery(conn, sql, ps, params);
        try {
            while(rs.next()){
//			使用javabean
                product1 p = new product1();
                p.setId(rs.getInt("id"));
                p.setPname(rs.getString("pname"));
                p.setPprice(rs.getInt("pprice"));
                list.add(p);
                System.out.println("p:"+p);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            baseDao.closeAll(conn, ps, rs);
        }
        return list;
    }
    //	查询一条数据
    public product1 selectOne(int id){
        product1 p = new product1();
        ResultSet rs = null;
        Connection conn = baseDao.getConn();
        PreparedStatement ps = null;
        String sql = "select * from product where id = ?";
        Object[] params = {id};
        rs = baseDao.executeQuery(conn, sql, ps, params);
        try {
            while(rs.next()){
//			使用javabean
                p.setId(rs.getInt("id"));
                p.setPname(rs.getString("pname"));
                p.setPprice(rs.getInt("pprice"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            baseDao.closeAll(conn, ps, rs);
        }
        return p;
    }
    //	添加
    public int insertProduct(product1 p){
        Connection conn = baseDao.getConn();
        String sql = "insert into product (pname,pprice) values(?,?)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object[] params = {p.getPname(),p.getPprice()};
        int i = baseDao.executeUpdate(conn, sql, ps, params);
        System.out.println("添加"+i+"条数据");
        baseDao.closeAll(conn, ps, rs);
        return i;
    }
    //	删除
    public int deleteProduct(int id){
        Connection conn = baseDao.getConn();
        String sql = "delete from product where id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object[] params = {id};
        int i = baseDao.executeUpdate(conn, sql, ps, params);
        System.out.println("删除"+i+"条数据");
        baseDao.closeAll(conn, ps, rs);
        return i;
    }

    //	修改
    public int updateProduct(product1 p){
        Connection conn = baseDao.getConn();
        String sql = "update product set pname=?,pprice=? where id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object[] params = {p.getPname(),p.getPprice(),p.getId()};
        int i = baseDao.executeUpdate(conn, sql, ps, params);
        System.out.println("修改了"+i+"条数据");
        baseDao.closeAll(conn, ps, rs);
        return i;
    }

}

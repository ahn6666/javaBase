package dao;

import domain.product;

import java.util.List;

public interface productDao {
    //查询所有的数据
    public List<product> findAll();
    //查询指定id的数据
    public product findById(Integer id);
    //添加一条数据
    public void Add(product product);
    //删除指定id的值
    public void deleteById(Integer id);
    //更新指定id的数据
    public void updateById(product product);
    //获取指定的数据
    public List<product> findByPage(Integer currentPage, Integer rows);
    //获取总页面数
    public int findTotalCount();
}

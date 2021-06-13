package service;

import domain.pageBean;
import domain.product;

import java.util.List;

public interface productService {
    public List<product> findAll();
    //查询指定id的数据
    public product findById(Integer id);
    //添加一条数据
    public void Add(product product);
    //删除指定id的值
    public void deleteById(Integer id);
    //更新指定id的数据
    public void updateById(product product);

    pageBean<product> findByPage(Integer currentPage, Integer rows);
}

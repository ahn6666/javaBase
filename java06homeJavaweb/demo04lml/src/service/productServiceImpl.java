package service;

import dao.productDao;
import dao.productDaoImpl;
import domain.pageBean;
import domain.product;

import java.util.List;

public class productServiceImpl implements productService{
     productDao pro=   new productDaoImpl();
    @Override
    public List<product> findAll() {
        return pro.findAll();
    }

    @Override
    public product findById(Integer id) {
        return pro.findById(id);
    }

    @Override
    public void Add(product product) {
        pro.Add(product);
        return ;
    }

    @Override
    public void deleteById(Integer id) {
        pro.deleteById(id);

    }

    @Override
    public void updateById(product product) {
                pro.updateById(product);
    }

    @Override
    public pageBean<product> findByPage(Integer currentPage, Integer rows) {
        pageBean<product> productpageBean = new pageBean<>();

//         int rows;//每页显示的条数
        productpageBean.setRows(rows);
//        int totalCount;//总记录数
        int totalCount = pro.findTotalCount();

        productpageBean.setTotalCount(totalCount);
//         int totalPage;//总页码=总记录数%每页显示条数==0？总记录数/每页显示条数：总记录数/每页显示条数+1；
        int totalPage=totalCount%rows==0?(totalCount/rows):(totalCount/rows+1);
        productpageBean.setTotalPage(totalPage);
        //        int currentPage;//当前页码
        if (currentPage<=1)
        {
            currentPage=1;
        }else if (currentPage>=totalPage)
        {
            currentPage=totalPage;
        }
        productpageBean.setCurrentPage(currentPage);
//        List<T> list;//每页的数据list集合
        List<product> byPage = pro.findByPage(currentPage, rows);
        productpageBean.setList(byPage);


        return  productpageBean;
    }
}

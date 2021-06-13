package dao;

import domain.product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.jdbcUtils;

import java.util.List;

public class productDaoImpl  implements productDao{
   private JdbcTemplate jdbcTemplate=  new JdbcTemplate(jdbcUtils.getDataSource());
    @Override
    public List<product> findAll() {
        String sql="select *from product ";
        List<product> pro = jdbcTemplate.query(sql,new BeanPropertyRowMapper<product>(product.class));
        return pro;
    }

    /**
     * 其实设置这个只是为了修改操作
     * @param id
     * @return
     */
    @Override
    public product findById(Integer id) {
        String sql="select *from product where id = ?";
        product product = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(product.class),id);
    return  product;
    }

    @Override
    public void Add(product product) {

        String sql="INSERT INTO product(pprice,pname) VALUES(?,?)";
        jdbcTemplate.update(sql,product.getPprice(),product.getPname());
    }

    @Override
    public void deleteById(Integer id) {
        String sql="DELETE  FROM product WHERE id=?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public void updateById(product product) {
        String sql="UPDATE  product SET pprice=? ,pname=? WHERE id =?";
        jdbcTemplate.update(sql,product.getPprice(),product.getPname(),product.getId());
    }

    @Override
    public List<product> findByPage(Integer currentPage, Integer rows) {
        String sql="select *from product limit ?,?";
        int start=(currentPage-1)*5;
        List<product> product = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(product.class), start, rows);

        return product;
    }

    @Override
    public int findTotalCount() {
        String sql="SELECT COUNT(*) FROM product";
        int TotalCount = jdbcTemplate.queryForObject(sql,Integer.class);
        return TotalCount;
    }

}

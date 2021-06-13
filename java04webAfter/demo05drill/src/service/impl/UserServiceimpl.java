package service.impl;

import dao.UserDao.UserDao;
import dao.UserDao.UserDaoLmpl;
import domain.pageBean;
import domain.user;
import service.UserService;

import java.util.List;
import java.util.Map;


public class UserServiceimpl  implements UserService {
   private UserDao userDao = new UserDaoLmpl();
    /**
     * 查询用户所有的信息
     * @return
     */
    @Override
    public List<user> findAll() {
        //调用dao来完成查询

        return userDao.findAll();
    }

    @Override
    public user login(user user) {
        return userDao.finduserDaoByuserAndpassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void adduser(user user) {
        userDao.add(user);
    }

    @Override
    public void delectByid(String id) {
        userDao.delectId(Integer.parseInt(id));
    }

    @Override
    public user findById(String id) {
        return userDao.findId(Integer.parseInt(id));

    }

    @Override
    public void update(user user) {
        userDao.updateById(user);
    }

    @Override
    public void delectSECECTByid(String[] uids) {
        for (String uid : uids) {
            userDao.delectId(Integer.parseInt(uid));
        }
    }

    @Override
    public pageBean<user> findUserByPage(String currentPage1, String rows1, Map<String, String[]> condition) {
        System.out.println(rows1);
        int currentPage= Integer.parseInt(currentPage1);
        int rows = Integer.parseInt(rows1);
            if (currentPage<=0)
            {
                currentPage=1;
            }
        //1.创建空的pageBean对象
        pageBean<user> userpageBean = new pageBean<>();
        //2.设置当前页面属性和rows属性
        userpageBean.setCurrentPage(currentPage);
        userpageBean.setRows(rows);
        //3.调用dao查询totalCount属性
          int totalCount= userDao.finTotalCount(condition);
          userpageBean.setTotalCount(totalCount);
        //4，开始的查询以及页面 start=(CountPage-1)*rows
        int start;
        start=(currentPage-1)*rows;
        //5.调用dao查询list集合
      List list= userDao.finfByPage(condition,start,rows);
        userpageBean.setList(list);
        //6.计算总页码
        int totalPage;
        if (totalCount%rows==0)
        {
            totalPage=totalCount/rows;
        }else
        {
            totalPage=totalCount/rows+1;
        }
        userpageBean.setTotalPage(totalPage);
        //7.返回pageBean
        return userpageBean;
    }


}

package dao.UserDao;

import domain.user;

import java.util.List;
import java.util.Map;

/**
 * 用户操作的dao
 */
public interface UserDao {

    public List<user> findAll();
    public user finduserDaoByuserAndpassword(String username,String password);

    void add(user user);

    void delectId(int parseInt);

    user findId(int parseInt);


    void updateById(user user);

    /**
     * 总记录数
     * @return
     * @param condition
     */
    int finTotalCount(Map<String, String[]> condition);

    /**
     * 开始的每页
     * @param condition
     * @param start
     * @param rows
     */
    List finfByPage(Map<String, String[]> condition, int start, int rows);
}

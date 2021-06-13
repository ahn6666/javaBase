package service;

import domain.pageBean;
import domain.user;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {
    /**
     * 查询用户所有信息
     * @return
     */
    public List<user> findAll();


   public user login(user user);

    /**
     * 添加用户
     * @param user
     */


    void adduser(user user);

    /**
     * 删除用户
     * @param id
     */
    void delectByid(String id);

    user findById(String id);

    void update(user user);

    void delectSECECTByid(String[] uids);


    pageBean<user> findUserByPage(String parseInt, String parseInt1, Map<String, String[]> condition);
}

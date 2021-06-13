package service;

import dao.userDao;
import dao.userDaoImpl;
import domain.user;

public class userServiceImpl implements userService{
    userDao user=new userDaoImpl();
    @Override
    public user findByUser(String name, String password) {
        return user.findByUser(name,password);
    }

    @Override
    public void addUser(String name, String password) {
        user.addUser(name,password);
        return;
    }
}

package dao;

import domain.product;
import domain.user;

import java.util.List;

public interface userDao {
    public user findByUser(String name,String password);

    void addUser(String name, String password);
}

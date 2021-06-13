package service;

import domain.user;

public interface userService {
    public user findByUser(String name, String password);

    void addUser(String name, String password);
}

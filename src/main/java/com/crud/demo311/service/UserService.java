package com.crud.demo311.service;


import com.crud.demo311.model.User;

import java.util.List;


public interface UserService {
    User addUser(User user, Long[] roles);

    User findUserById(long id);

    User findUserByName(String name);

    void updateUser(User user, Long[] roles);

    void removeUser(long id);

    List<User> findAllUsers();



}

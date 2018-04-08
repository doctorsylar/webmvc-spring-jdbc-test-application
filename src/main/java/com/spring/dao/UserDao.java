package com.spring.dao;

import com.spring.entity.User;

import java.util.List;

public interface UserDao {
    void insert (User user);

    void update (User user);

    void delete (int id);

    User get (int id);

    User get (String name);

    List<User> getAll ();
}

package com.spring.dao;

import com.spring.entity.User;
import com.spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class UserDaoMysqlImpl implements UserDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public void insert(User user) {
        String sql = "insert into users (name, password) values (?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getPassword());
    }

    @Override
    public void update(User user) {
        String sql = "update users set name=?, password=? where id=?";
        jdbcTemplate.update(sql, user.getName(), user.getPassword(), user.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from users where id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public User get(int id) {
        String sql = "select * from users where id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public User get(String name) {
        String sql = "select * from users where name=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), name);
    }

    @Override
    public List<User> getAll() {
        String sql = "select * from users";
        return jdbcTemplate.query(sql, new UserMapper());
    }
}

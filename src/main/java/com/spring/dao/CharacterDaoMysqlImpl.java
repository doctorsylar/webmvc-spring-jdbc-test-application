package com.spring.dao;

import com.spring.entity.User;
import com.spring.entity.mages.MageImpl;
import com.spring.mapper.CharacterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CharacterDaoMysqlImpl implements CharacterDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public void insert(MageImpl mage, int userId) {
        String sql = "insert into characters (" +
                "user_id, name, class, speed, attack, defence, buff, " +
                "inventory_stuff, inventory_robe, inventory_slot1, inventory_slot2) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, userId, mage.getName(), mage.getClassName(),
                mage.getSpeed(), mage.getAttackLevel(), mage.getDefenceLevel(), mage.getBuffLevel(),
                mage.getInventory().get("Stuff"), mage.getInventory().get("Robe"),
                mage.getInventory().get("ActiveItem1"), mage.getInventory().get("ActiveItem2"));
    }

    @Override
    public void update(MageImpl mage) {
        String sql = "update characters set " +
                "name=?, class=?, speed=?, attack=?, defence=?, buff=?, " +
                "inventory_stuff=?, inventory_robe=?, inventory_slot1=?, inventory_slot2=? " +
                "where id=? ";
        jdbcTemplate.update(sql, mage.getName(), mage.getClassName(),
                mage.getSpeed(), mage.getAttackLevel(), mage.getDefenceLevel(), mage.getBuffLevel(),
                mage.getInventory().get("Stuff"), mage.getInventory().get("Robe"),
                mage.getInventory().get("ActiveItem1"), mage.getInventory().get("ActiveItem2"),
                mage.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from characters where id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public MageImpl get(int id) {
        String sql = "select * from characters where id=?";
        return jdbcTemplate.queryForObject(sql, new CharacterMapper(), id);
    }

    @Override
    public List<MageImpl> getAll() {
        String sql = "select * from characters";
        return jdbcTemplate.query(sql, new CharacterMapper());
    }

    @Override
    public List<MageImpl> getAllForUser(User user) {
        String sql = "select * from characters where user_id=?";
        return jdbcTemplate.query(sql, new CharacterMapper(), user.getId());
    }
}

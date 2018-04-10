package com.spring.dao;

import com.spring.entity.mages.AbstractMageImpl;
import com.spring.entity.mages.Mage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CharacterDaoMysqlImpl implements CharacterDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public void insert(AbstractMageImpl mage, int userId) {
        String sql = "insert into characters (" +
                "user_id, name, class, health, speed, attack, defence, buff, " +
                "inventory_stuff, inventory_robe, inventory_slot1, inventory_slot2) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, userId, mage.getName(), mage.getClass(), mage.getHealthMax(),
                mage.getSpeed(), mage.getAttackLevel(), mage.getDefenceLevel(), mage.getBuffLevel(),
                mage.getInventory().get("Stuff"), mage.getInventory().get("Robe"),
                mage.getInventory().get("ActiveItem1"), mage.getInventory().get("ActiveItem2"));
    }

    @Override
    public void update(AbstractMageImpl mage) {
        String sql = "update characters set " +
                "name=?, class=?, health=?, speed=?, attack=?, defence=?, buff=?, " +
                "inventory_stuff=?, inventory_robe=?, inventory_slot1=?, inventory_slot2=? " +
                "where id=? ";
        jdbcTemplate.update(sql, mage.getName(), mage.getClass(), mage.getHealthMax(),
                mage.getSpeed(), mage.getAttackLevel(), mage.getDefenceLevel(), mage.getBuffLevel(),
                mage.getInventory().get("Stuff"), mage.getInventory().get("Robe"),
                mage.getInventory().get("ActiveItem1"), mage.getInventory().get("ActiveItem2"),
                mage.getId());
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public AbstractMageImpl get(int id) {
        return null;
    }

    @Override
    public List<AbstractMageImpl> getAll() {
        return null;
    }
}

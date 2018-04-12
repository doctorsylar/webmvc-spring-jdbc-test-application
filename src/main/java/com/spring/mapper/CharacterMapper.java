package com.spring.mapper;

import com.spring.entity.mages.*;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CharacterMapper implements RowMapper<MageImpl> {
    @Override
    public MageImpl mapRow(ResultSet resultSet, int i) throws SQLException {
        MageImpl mage;
        switch (resultSet.getString("class")) {
            case "FireMage" : mage = new FireMage(resultSet.getString("name"),
                    resultSet.getInt("speed"), resultSet.getInt("attack"),
                    resultSet.getInt("defence"), resultSet.getInt("buff"));
                break;
            case "WaterMage" : mage = new WaterMage(resultSet.getString("name"),
                    resultSet.getInt("speed"), resultSet.getInt("attack"),
                    resultSet.getInt("defence"), resultSet.getInt("buff"));
                break;
            case "EarthMage" : mage = new EarthMage(resultSet.getString("name"),
                    resultSet.getInt("speed"), resultSet.getInt("attack"),
                    resultSet.getInt("defence"), resultSet.getInt("buff"));
                break;
            case "WindMage" : mage = new WindMage(resultSet.getString("name"),
                    resultSet.getInt("speed"), resultSet.getInt("attack"),
                    resultSet.getInt("defence"), resultSet.getInt("buff"));
                break;
                default : mage = new FireMage();
                break;
        }
        mage.fillInventory(
                resultSet.getString("inventory_stuff"),
                resultSet.getString("inventory_robe"),
                resultSet.getString("inventory_slot1"),
                resultSet.getString("inventory_slot2")
        );
        mage.setClassName(mage.getClass().getSimpleName());
        mage.setId(resultSet.getInt("id"));
        return mage;
    }
}

package com.spring.services;

import com.spring.dao.CharacterDao;
import com.spring.entity.User;
import com.spring.entity.mages.MageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Autowired
    CharacterDao characterDao;

    @Override
    public void insert(MageImpl mage, int userId) {
        mage.setLevel();
        characterDao.insert(mage, userId);
    }

    @Override
    public void update(MageImpl mage) {
        mage.setLevel();
        characterDao.update(mage);
    }

    @Override
    public void delete(int id) {
        characterDao.delete(id);
    }

    @Override
    public MageImpl get(int id) {
        return characterDao.get(id);
    }

    @Override
    public List<MageImpl> getAll() {
        return characterDao.getAll();
    }

    @Override
    public List<MageImpl> getAllForUser(User user) {
        return characterDao.getAllForUser(user);
    }
}

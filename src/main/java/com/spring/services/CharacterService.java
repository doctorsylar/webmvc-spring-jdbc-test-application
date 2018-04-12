package com.spring.services;

import com.spring.entity.User;
import com.spring.entity.mages.MageImpl;

import java.util.List;

public interface CharacterService {

    void insert (MageImpl mage, int userId);

    void update (MageImpl mage);

    void delete (int id);

    MageImpl get (int id);

    List<MageImpl> getAll ();

    List<MageImpl> getAllForUser (User user);
}

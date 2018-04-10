package com.spring.services;

import com.spring.entity.mages.AbstractMageImpl;

import java.util.List;

public interface CharacterService {

    void insert (AbstractMageImpl mage, int userId);

    void update (AbstractMageImpl mage);

    void delete (int id);

    AbstractMageImpl get (int id);

    List<AbstractMageImpl> getAll ();


}

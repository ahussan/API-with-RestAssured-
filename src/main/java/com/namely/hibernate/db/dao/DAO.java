package com.namely.hibernate.db.dao;

import com.namely.hibernate.db.entities.BaseEntity;

import java.io.Serializable;
import java.util.List;


public interface DAO<T extends BaseEntity, ID extends Serializable> {
    T findById(ID id);

    List<T> findAll();

    void save(final T entity);
}

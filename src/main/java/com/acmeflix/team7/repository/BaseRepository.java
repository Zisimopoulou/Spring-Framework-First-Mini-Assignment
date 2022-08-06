package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.BaseModel;

import java.util.List;

public interface BaseRepository<T extends BaseModel, ID> {
    T create(final T entity);

    void update(T entity);

    void delete(T entity);

    void deleteById(ID id);

    boolean exists(T entity);

    T get(ID id);

    List<T> findAll();
}

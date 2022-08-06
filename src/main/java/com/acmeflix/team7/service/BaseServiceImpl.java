package com.acmeflix.team7.service;

import com.acmeflix.team7.base.BaseComponent;
import com.acmeflix.team7.domain.BaseModel;
import com.acmeflix.team7.repository.BaseRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public abstract class BaseServiceImpl<T extends BaseModel> extends BaseComponent implements BaseService<T> {
    public abstract BaseRepository<T, Long> getRepository();

    @Override
    public List<T> createAll(final T... items) {
        return createAll(Arrays.asList(items));
    }
    @Override
    public List<T> createAll(final List<T> items) {
        final List<T> createdItems = new ArrayList<>();
        for (final T item : items) {
            createdItems.add(create(item));
        }
        return createdItems;
    }
    @Override
    public T create(final T item) {
        log.trace("Creating {}.", item);
        return getRepository().create(item);
    }

    @Override
    public void update(final T item) {
        log.trace("Updating {}.", item);
        getRepository().update(item);
    }

    @Override
    public void delete(final T item) {
        log.trace("Deleting {}.", item);
        getRepository().delete(item);
    }

    @Override
    public void deleteById(final Long id) {
        getRepository().deleteById(id);
    }

    @Override
    public boolean exists(final T item) {
        log.trace("Checking whether {} exists.", item);
        return getRepository().exists(item);
    }

    @Override
    public T get(final Long id) {
        log.trace("Retrieving item with id {}.", id);
        return getRepository().get(id);
    }

    @Override
    public List<T> findAll() {
        log.trace("Retrieving all items.");
        return getRepository().findAll();
    }
}
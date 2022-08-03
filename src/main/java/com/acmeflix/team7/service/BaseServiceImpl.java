package com.acmeflix.team7.service;

import com.acmeflix.team7.base.BaseComponent;
import com.acmeflix.team7.domain.BaseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
public abstract class BaseServiceImpl<T extends BaseModel> extends BaseComponent implements BaseService<T> {
    public abstract JpaRepository<T, Long> getRepository();

    @Override
    public List<T> createAll(final T... items) {
        return createAll(Arrays.asList(items));
    }

    @Override
    public List<T> createAll(final List<T> items) {
        return getRepository().saveAll(items);
    }

    @Override
    public T create(final T item) {
        log.trace("Creating {}.", item);
        return getRepository().save(item);
    }

    @Override
    public void update(final T item) {
        log.trace("Updating {}.", item);
        getRepository().save(item);
    }

    @Override
    public void delete(final T item) {
        final T itemFound = getRepository().getReferenceById(item.getId());
        log.trace("Deleting {}.", itemFound);
        getRepository().delete(itemFound);
    }

    @Override
    public void deleteById(final Long id) {
        final T itemFound = getRepository().getReferenceById(id);
        log.trace("Deleting {}.", itemFound);
        getRepository().deleteById(id);
    }

    @Override
    public boolean exists(final T item) {
        log.trace("Checking whether {} exists.", item);
        return getRepository().existsById(item.getId());
    }

    @Override
    public T get(final Long id) {
        log.trace("Retrieving item with id {}.", id);
        return getRepository().findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<T> findAll() {
        log.trace("Retrieving all items.");
        return getRepository().findAll();
    }
}
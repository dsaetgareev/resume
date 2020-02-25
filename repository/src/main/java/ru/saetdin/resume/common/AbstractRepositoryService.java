package ru.saetdin.resume.common;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public abstract class AbstractRepositoryService<T extends EntityWithId> implements RepositoryService<T>{

    @Autowired
    private JpaRepository<T, UUID> repository;

    @Override
    @Transactional
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public T read(UUID uuid) {
        Optional<T> entity = repository.findById(uuid);

        return entity.orElse(null);
    }

    @Override
    @Transactional
    public T update(T entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void delete(UUID uuid) {
        T one = repository.getOne(uuid);
        repository.delete(one);
    }

    @Override
    @Transactional
    public List<T> list() {
        return repository.findAll();
    }
}

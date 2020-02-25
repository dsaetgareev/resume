package ru.saetdin.resume.common;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public interface RepositoryService<T extends EntityWithId> {
    @Transactional
    T create(T entity);
    T read(UUID uuid);
    @Transactional
    T update(T entity);
    void delete(UUID uuid);
    List<T> list();
}

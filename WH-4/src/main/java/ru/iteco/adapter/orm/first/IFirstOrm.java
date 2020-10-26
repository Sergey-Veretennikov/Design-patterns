package ru.iteco.adapter.orm.first;

import ru.iteco.adapter.orm.entity.IDbEntity;

public interface IFirstOrm<T extends IDbEntity> {

    void create(T entity);

    T read(int id);

    void update(T entity);

    void delete(T entity);
}


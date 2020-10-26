package ru.iteco.adapter.orm.first;

import ru.iteco.adapter.orm.entity.IDbEntity;

public class IFirstOrmImpl<T extends IDbEntity> implements IFirstOrm<T> {

    @Override
    public void create(T entity) {

    }

    @Override
    public T read(int id) {
        return null;
    }

    @Override
    public void update(T entity) {

    }

    @Override
    public void delete(T entity) {

    }
}

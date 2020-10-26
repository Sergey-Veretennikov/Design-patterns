package ru.iteco.adapter.orm.first;

import ru.iteco.adapter.Target;
import ru.iteco.adapter.orm.entity.IDbEntity;

public interface TargetIFirst<T extends IDbEntity> extends Target {

    void create(T entity);

    T read(Long id);

    void update(T entity);

    void delete(T entity);
}

package ru.iteco.adapter;

import ru.iteco.adapter.orm.entity.IDbEntity;
import ru.iteco.adapter.orm.first.IFirstOrm;
import ru.iteco.adapter.orm.first.TargetIFirst;

public class IFirstOrmAdapterImpl<T extends IDbEntity> implements TargetIFirst<T> {

    private final IFirstOrm<T> firstOrm;

    public IFirstOrmAdapterImpl(IFirstOrm<T> firstOrm) {
        this.firstOrm = firstOrm;
    }

    @Override
    public void create(T entity) {
        firstOrm.create(entity);
    }

    @Override
    public T read(Long id) {
        return firstOrm.read(Math.toIntExact(id));
    }

    @Override
    public void update(T entity) {
        firstOrm.update(entity);
    }

    @Override
    public void delete(T entity) {
        firstOrm.update(entity);
    }
}

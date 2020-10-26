package ru.iteco.adapter;

import ru.iteco.adapter.orm.entity.IDbEntity;
import ru.iteco.adapter.orm.second.ISecondOrm;
import ru.iteco.adapter.orm.second.ISecondOrmContext;
import ru.iteco.adapter.orm.second.TargetISecond;

import java.util.Set;
import java.util.stream.Collectors;

public class ISecondOrmAdapterImpl<T extends IDbEntity> implements TargetISecond<T> {

    private final ISecondOrm secondOrm;
    private final ISecondOrmContext secondOrmContext;

    public ISecondOrmAdapterImpl(ISecondOrm secondOrm) {
        this.secondOrm = secondOrm;
        this.secondOrmContext = null;
    }

    public ISecondOrmAdapterImpl(ISecondOrmContext secondOrmContext) {
        this.secondOrm = null;
        this.secondOrmContext = secondOrmContext;
    }

    @Override
    public ISecondOrmContext getContext() {
        return secondOrm.getContext();
    }

    @Override
    public Set<T> getUsers() {
        return secondOrmContext.getUsers().stream()
                .map(dbUserEntity -> (T) dbUserEntity)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<T> getUserInfos() {
        return secondOrmContext.getUserInfos().stream()
                .map(dbUserInfoEntity -> (T) dbUserInfoEntity)
                .collect(Collectors.toSet());
    }
}

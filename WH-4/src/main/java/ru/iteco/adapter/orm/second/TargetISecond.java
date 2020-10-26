package ru.iteco.adapter.orm.second;

import ru.iteco.adapter.Target;
import ru.iteco.adapter.orm.entity.IDbEntity;

import java.util.Set;

public interface TargetISecond<T extends IDbEntity> extends Target {

    ISecondOrmContext getContext();

    Set<T> getUsers();

    Set<T> getUserInfos();
}

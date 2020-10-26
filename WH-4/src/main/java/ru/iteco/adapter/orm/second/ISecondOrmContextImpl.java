package ru.iteco.adapter.orm.second;

import ru.iteco.adapter.orm.entity.DbUserEntity;
import ru.iteco.adapter.orm.entity.DbUserInfoEntity;

import java.util.Collections;
import java.util.Set;

public class ISecondOrmContextImpl implements ISecondOrmContext {

    @Override
    public Set<DbUserEntity> getUsers() {
        return Collections.emptySet();
    }

    @Override
    public Set<DbUserInfoEntity> getUserInfos() {
        return Collections.emptySet();
    }
}

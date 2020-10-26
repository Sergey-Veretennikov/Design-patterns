package ru.iteco.adapter.orm.second;

import ru.iteco.adapter.orm.entity.DbUserEntity;
import ru.iteco.adapter.orm.entity.DbUserInfoEntity;

import java.util.Set;

public interface ISecondOrmContext {

    Set<DbUserEntity> getUsers();

    Set<DbUserInfoEntity> getUserInfos();
}

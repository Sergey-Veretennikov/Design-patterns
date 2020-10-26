package ru.iteco.adapter;

import ru.iteco.adapter.orm.entity.DbUserEntity;
import ru.iteco.adapter.orm.first.IFirstOrm;
import ru.iteco.adapter.orm.first.IFirstOrmImpl;
import ru.iteco.adapter.orm.first.TargetIFirst;

public class Main {

    public static void main(String[] args) {

        IFirstOrm<DbUserEntity> firstOrm = new IFirstOrmImpl<>();
        Adapter<DbUserEntity> adapter = new Adapter<>(new IFirstOrmAdapterImpl<>(firstOrm));
        adapter.createAdapter();
        TargetIFirst<DbUserEntity> client = adapter.getTargetIFirst();
        client.create(new DbUserEntity());

    }

}

package ru.iteco.adapter;

import ru.iteco.adapter.orm.entity.IDbEntity;
import ru.iteco.adapter.orm.first.TargetIFirst;
import ru.iteco.adapter.orm.second.TargetISecond;

public class Adapter<T extends IDbEntity> {

    private final Target target;
    private TargetIFirst<T> targetIFirst;
    private TargetISecond<T> targetISecond;

    public Adapter(Target target) {
        this.target = target;
    }


    void createAdapter() {
        if (target instanceof IFirstOrmAdapterImpl) {
            targetIFirst = (TargetIFirst<T>) target;
        }
        if (target instanceof ISecondOrmAdapterImpl) {
            targetISecond = (TargetISecond<T>) target;
        }
    }

    TargetIFirst<T> getTargetIFirst() {
        return targetIFirst;
    }

    TargetISecond<T> getTargetISecond() {
        return targetISecond;
    }
}

package ru.iteco.reportutility.infrastructure.transformers;

import ru.iteco.reportutility.infrastructure.DataTransformer;

public abstract class ReportServiceTransformerBase implements DataTransformer {

    protected final DataTransformer dataTransformer;

    protected ReportServiceTransformerBase(DataTransformer dataTransformer) {
        this.dataTransformer = dataTransformer;
    }

    // Уже реализован в интерфейсе
   /* @Override
    public abstract Report transformData(DataRow[] data);*/
}

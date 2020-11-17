package ru.iteco.reportutility.services;

import ru.iteco.reportutility.infrastructure.DataTransformerCreator;
import ru.iteco.reportutility.models.DataRow;
import ru.iteco.reportutility.models.Report;
import ru.iteco.reportutility.models.ReportConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public abstract class ReportServiceBase implements ReportService {

    private final String[] args;

    protected ReportServiceBase(String[] args) {
        this.args = args;
    }

    @Override
    public Report createReport() {
        var config = parseConfig();
        var dataTransformer = DataTransformerCreator.createTransformer(config);

        var fileName = args[0];
        String text = null;
        try {
            text = Files.readString(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println(e);
        }

        var data = getDataRows(text);
        return dataTransformer.transformData(data);
    }

    protected abstract DataRow[] getDataRows(String text);

    private ReportConfig parseConfig() {
        //Использоват @Builder() от lombok
        return ReportConfig.builder()
                .withData(Arrays.asList(args).contains("-withData"))
                .withIndex(Arrays.asList(args).contains("-withIndex"))
                .withTotalVolume(Arrays.asList(args).contains("-withTotalVolume"))
                .withTotalWeight(Arrays.asList(args).contains("-withTotalWeight"))
                .volumeSum(Arrays.asList(args).contains("-volumeSum"))
                .weightSum(Arrays.asList(args).contains("-weightSum"))
                .costSum(Arrays.asList(args).contains("-costSum"))
                .countSum(Arrays.asList(args).contains("-countSum"))
                .build();
    }
}

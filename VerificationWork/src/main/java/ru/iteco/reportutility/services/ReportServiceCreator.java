package ru.iteco.reportutility.services;

import ru.iteco.reportutility.exception.SupportedException;

public class ReportServiceCreator {

    private ReportServiceCreator() {
    }

    public static ReportService getReportService(String[] args) throws SupportedException {
        var filename = args[0];

        if (filename.endsWith(".txt")) {
            return new TxtReportService(args);
        }

        if (filename.endsWith(".csv")) {
            return new CsvReportService(args);
        }

        if (filename.endsWith(".xlsx")) {
            return new XlsxReportService(args);
        }

        // Лучше использовать свое исключение
        throw new SupportedException("this extension not supported");
    }
}

package ru.iteco.reportutility.services;

import ru.iteco.reportutility.models.DataRow;

public class XlsxReportService extends ReportServiceBase {

    public XlsxReportService(String[] args) {
        super(args);
    }

    @Override
    protected DataRow[] getDataRows(String text) {
        return new DataRow[0];
    }
}

package ru.iteco.reportutility.services;

import org.apache.commons.lang.StringUtils;
import ru.iteco.reportutility.models.Report;
import ru.iteco.reportutility.models.ReportRow;

public class PrintReportServiceImpl implements PrintReportService {

    private static final String TAB = "\t";

    @Override
    public void printReport(Report report) {
        if (report.getConfig().isWithData() || report.getData() == null || report.getData().length == 0) {
            return;
        }
        var headerRow = "Наименование\tОбъём упаковки\tМасса упаковки\tСтоимость\tКоличество";

        if (report.getConfig().isWithIndex()) {
            headerRow = "№\t" + headerRow;
        }
        if (report.getConfig().isWithTotalVolume()) {
            headerRow = headerRow + "\tСуммарный объём";
        }
        if (report.getConfig().isWithTotalWeight()) {
            headerRow = headerRow + "\tСуммарный вес";
        }

        System.out.println(headerRow);
        for (int i = 0; i < report.getData().length; i++) {
            var dataRow = report.getData()[i];

            // лучше использовать StringBuilder
            var str = new StringBuilder()
                    .append(i + 1).append(TAB).append(dataRow.getName())
                    .append((i != 0) ? StringUtils.repeat(TAB, 2) : TAB)
                    .append(dataRow.getVolume()).append(StringUtils.repeat(TAB, 4))
                    .append(dataRow.getWeight()).append(StringUtils.repeat(TAB, 4))
                    .append(dataRow.getCost()).append(StringUtils.repeat(TAB, 3))
                    .append(dataRow.getCount()).append(StringUtils.repeat(TAB, 3))
                    .append(dataRow.getVolume().multiply(dataRow.getCount()))
                    .append(StringUtils.repeat(TAB, 2)).append(dataRow.getWeight().multiply(dataRow.getCount()));

           /* var str = (i + 1 + TAB + dataRow.getName() + ((i != 0) ? StringUtils.repeat(TAB, 2) : TAB)
                    + dataRow.getVolume() + StringUtils.repeat(TAB, 4) + dataRow.getWeight()
                    + StringUtils.repeat(TAB, 4) + dataRow.getCost() + StringUtils.repeat(TAB, 3)
                    + dataRow.getCount() + StringUtils.repeat(TAB, 3) + dataRow.getVolume().multiply(dataRow.getCount())
                    + StringUtils.repeat(TAB, 2) + dataRow.getWeight().multiply(dataRow.getCount()));*/
            System.out.println(str.toString());
        }

        System.out.println();

        // report.getRows().size() лучше использовать report.getRows().isEmpty()
        if (report.getRows() == null || report.getRows().isEmpty()) {
            return;
        }
        System.out.println("Итого:");
        for (ReportRow reportRow : report.getRows()) {
            System.out.println(reportRow.getName() + TAB + reportRow.getValue());
        }
    }
}

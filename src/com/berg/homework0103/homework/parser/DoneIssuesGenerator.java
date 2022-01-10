package com.berg.homework0103.homework.parser;

import com.berg.homework0103.homework.dto.Issue;
import com.berg.homework0103.homework.report.ReportGenerator;
import com.berg.homework0103.homework.util.StringUtil;


/**
 *  Порядковый номер клиента с предыдущего лог файла
 * - Дата и время созвона
 * - Номер телефона клиента
 *
 * Например:
 * 2, 2022-01-04 04:15, +375 (25) 777-77-65
 * 1, 2022-01-04 04:30, +375 (29) 999-78-90
 * 3, 2022-01-04 04:45, +375 (33) 365-21-93
 *
 * Номера телефонов могут быть представлены по-разному,
 * поэтому привести их к одному формату: +375 (29) 999-78-90.
 * */
public class DoneIssuesGenerator implements ReportGenerator {

    @Override
    public String generate(Issue issue) {
        var result = new StringBuilder();
        result.append(issue.getClientId())
                .append(StringUtil.SEPARATOR)
                .append(issue.getDateTime().toString())
                .append(StringUtil.SEPARATOR)
                .append(issue.getPhoneNumber())
                .append("\n");
        return result.toString();
    }
}

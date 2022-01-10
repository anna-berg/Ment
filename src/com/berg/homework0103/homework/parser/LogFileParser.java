package com.berg.homework0103.homework.parser;

import com.berg.homework0103.cources.util.StringUtils;
import com.berg.homework0103.homework.dto.Issue;
import com.berg.homework0103.homework.util.StringUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

public class LogFileParser {

    private static final String ID_GROUP = "id";
    private static final String TIME_GROUP = "time";
    private static final String NAME_GROUP = "name";
    private static final String PHONE_GROUP = "phone";
    private static final String TEXT_GROUP = "text";
    private static final String LOG_FILE_REGEXP = "^(?<id>\\d+), (?<time>\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}), (?<name>[А-Яа-яёЁ]+\\s[А-Яа-яёЁ]+), " +
            "(?<phone>(\\+?\\d{0,3})\\s?(\\d{2})\\s?(\\d{3})\\s?(\\d{2})\\s?(\\d{2})), (?<text>.+)$";
    private static final Pattern PATTERN = Pattern.compile(LOG_FILE_REGEXP);

    public BlockingQueue<Issue> parse(Path path) throws IOException {
        return buildIssue(path);
    }

    private BlockingQueue<Issue> buildIssue(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            var listOfIssues = lines.filter(not(StringUtils.EMPTY::equals))
                    .map(this::buildIssue)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toList());
            return new ArrayBlockingQueue<>(listOfIssues.size(), true, listOfIssues);
        }
    }

    private Optional<Issue> buildIssue(String line) {
        return Optional.of(line)
                .map(PATTERN::matcher)
                .filter(Matcher::find)
                .map(matcher -> {
                    int id = Integer.parseInt(matcher.group(ID_GROUP));
                    LocalDateTime time = LocalDateTime.parse(matcher.group(TIME_GROUP));
                    String name = matcher.group(NAME_GROUP);
                    String phone = matcher.group(PHONE_GROUP);
                    String text = matcher.group(TEXT_GROUP);
                    return new Issue(id, time, name, validate(phone), text);
                });
    }

    private String validate(String phone) {
        String regex = "(\\+?)(\\d{0,3})\\s?(\\d{2})\\s?(\\d{3})\\s?(\\d{2})\\s?(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()){
            matcher.appendReplacement(stringBuilder, StringUtil.CODE + " ($3) $4-$5-$6");
        }
        matcher.appendTail(stringBuilder);

        return stringBuilder.toString();
    }
}

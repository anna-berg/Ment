package com.berg.homework0103.homework;

import com.berg.homework0103.homework.dto.Issue;
import com.berg.homework0103.homework.parser.LogFileParser;
import com.berg.homework0103.homework.threads.Dispatcher;

import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SupportRunner {

    public static void main(String[] args) {
        var logFilePath = Path.of("resources", "issue.log");
        var logFileParser = new LogFileParser();
        Dispatcher dispatcher1 = new Dispatcher();
        Dispatcher dispatcher2 = new Dispatcher();

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(2);
        threadPool.scheduleAtFixedRate(() -> {
            try {
                BlockingQueue<Issue> issueList = logFileParser.parse(logFilePath);
                System.out.println("File is parsed " + issueList);
                while (!issueList.isEmpty()){
                    System.out.println("Dispatcher 1 taking a task: ");
                    dispatcher1.takeTask(issueList);
                    System.out.println("Dispatcher 2 taking a task: ");
                    dispatcher2.takeTask(issueList);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, 0, 2, TimeUnit.SECONDS);
    }
}

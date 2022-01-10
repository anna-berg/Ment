package com.berg.homework0103.homework.threads;

import com.berg.homework0103.homework.dto.Issue;
import com.berg.homework0103.homework.parser.DoneIssuesGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.BlockingQueue;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Dispatcher {

    private static int generator = 1;
    private final int id;

    public Dispatcher() {
        this.id = generator++;
    }
        DoneIssuesGenerator doneIssuesGenerator = new DoneIssuesGenerator();

    public void takeTask(BlockingQueue<Issue> issueList) {
        try {
            Issue issue = issueList.take();
            Thread.sleep(3L);
            System.out.println("Calling a client...");
            String issueReport = doneIssuesGenerator.generate(issue);
            Files.writeString(Path.of("resources", "issue-report.txt"), issueReport, CREATE, APPEND);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Dispatcher{" +
                "id=" + id +
                '}';
    }
}

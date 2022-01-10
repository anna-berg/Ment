package com.berg.homework0103.homework.dto;

import java.time.LocalDateTime;

public class Issue {

    private final int clientId;
    private final LocalDateTime dateTime;
    private final String name;
    private final String phoneNumber;
    private final String issueText;

    public Issue(int clientId, LocalDateTime dateTime, String name, String phoneNumber, String issueText) {
        this.clientId = clientId;
        this.dateTime = dateTime;
        this.name = name;

        this.phoneNumber = phoneNumber;
        this.issueText = issueText;
    }

    public int getClientId() {
        return clientId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIssueText() {
        return issueText;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "clientId=" + clientId +
                ", dateTime=" + dateTime +
                ", firstName='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", issueText='" + issueText + '\'' +
                '}';
    }
}

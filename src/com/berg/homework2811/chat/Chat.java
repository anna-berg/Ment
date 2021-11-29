package com.berg.homework2811.chat;

public class Chat implements Comparable<Chat> {
    private String name;
    private int userCount;

    public Chat(String name, int userCount) {
        this.name = name;
        this.userCount = userCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", userCount=" + userCount +
                '}';
    }

    @Override
    public int compareTo(Chat o) {
        return this.getName().compareTo(o.getName());
    }
}

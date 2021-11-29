package com.berg.homework2811.chat2;

import java.util.List;

public class Chat {
    private String chatName;
    private List<Person> users;

    public Chat(String chatName, List<Person> users) {
        this.chatName = chatName;
        this.users = users;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public List<Person> getUsers() {
        return users;
    }

    public void setUsers(List<Person> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Chat2{" +
                "chatName='" + chatName + '\'' +
                ", users=" + users +
                '}';
    }
}

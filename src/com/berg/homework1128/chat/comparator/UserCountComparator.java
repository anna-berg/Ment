package com.berg.homework1128.chat.comparator;

import com.berg.homework1128.chat.Chat;

import java.util.Comparator;

public class UserCountComparator implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o1.getUserCount(), o2.getUserCount());
    }
}

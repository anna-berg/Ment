package com.berg.homework2811.chat.comparator;

import com.berg.homework2811.chat.Chat;

import java.util.Comparator;

public class UserCountComparator implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o1.getUserCount(), o2.getUserCount());
    }
}

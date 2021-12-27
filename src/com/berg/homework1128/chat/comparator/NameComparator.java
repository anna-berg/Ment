package com.berg.homework1128.chat.comparator;

import com.berg.homework1128.chat.Chat;

import java.util.Comparator;

public class NameComparator implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

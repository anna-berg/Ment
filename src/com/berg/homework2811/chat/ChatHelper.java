package com.berg.homework2811.chat;

import java.util.Iterator;
import java.util.List;

public final class ChatHelper {
    private ChatHelper() {
    }

    public static List<Chat> removeChatLess1000User(List<Chat> chatList) {
//        chatList.removeIf(currentChat -> currentChat.getUserCount() < 1000);
        for (Iterator<Chat> iterator = chatList.iterator(); iterator.hasNext(); ) {
            Chat currentChat = iterator.next();
            if (currentChat.getUserCount() < 1000) {
                iterator.remove();
            }
        }
        return chatList;
    }
}

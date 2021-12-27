package com.berg.homework1128.chat;

import com.berg.homework1128.chat.comparator.NameComparator;
import com.berg.homework1128.chat.comparator.UserCountComparator;

import java.util.ArrayList;
import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {
        List<Chat> chatList = new ArrayList<>(List.of(
                new Chat("Chat1", 5478),
                new Chat("AChat2", 4554),
                new Chat("Chat3", 8423),
                new Chat("BChat4", 4554),
                new Chat("Chat5", 982),
                new Chat("DChat6", 1257),
                new Chat("Chat7", 15),
                new Chat("EChat8", 4554)
        ));

        System.out.println(ChatHelper.removeChatLess1000User(chatList));

        chatList.sort(new UserCountComparator().reversed().thenComparing(new NameComparator()));
        System.out.println(chatList);
    }
}

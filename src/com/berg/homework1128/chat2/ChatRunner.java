package com.berg.homework1128.chat2;

import java.util.ArrayList;
import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {
        List<Chat> chatList = new ArrayList<>(List.of(
                new Chat("Chat1", new ArrayList<>(List.of(
                        new Person(1, "Ivan", 28),
                        new Person(2, "Petr", 31),
                        new Person(3, "Sveta", 47),
                        new Person(4, "Anna", 27)
                ))),
                new Chat("Chat1", new ArrayList<>(List.of(
                        new Person(5, "Ivan", 11),
                        new Person(6, "Petr", 12),
                        new Person(7, "Sveta", 37),
                        new Person(8, "Anna", 42)
                ))),
                new Chat("Chat1", new ArrayList<>(List.of(
                        new Person(9, "Ivan", 12),
                        new Person(10, "Petr", 28),
                        new Person(11, "Sveta", 54),
                        new Person(12, "Anna", 37)
                )))
        ));

        List<Person> personList = filterAge(chatList);
        System.out.println(personList);
        double averageAge = getAverageAge(personList);
        System.out.println(averageAge);
    }

    public static double getAverageAge(List<Person> personList) {

        int sumAge = 0;
        for (Person person : personList) {
            sumAge += person.getAge();
        }
        return sumAge / (double) personList.size();
    }

    private static List<Person> filterAge(List<Chat> chatList) {

        List<Person> personList = new ArrayList<>();
        for (Chat chat : chatList) {
            List<Person> users = chat.getUsers();
            for (Person user : users) {
                if (user.getAge() > 18) {
                    personList.add(user);
                }
            }
        }
        return personList;
    }
}

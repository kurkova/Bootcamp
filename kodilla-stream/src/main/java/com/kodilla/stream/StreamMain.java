package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDay().getYear() <= 1998)
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getIdUser, user -> user));

        System.out.println("Number of users: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

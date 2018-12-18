package com.kodilla.stream;

import com.kodilla.stream.Book.Book;
import com.kodilla.stream.Book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        /*Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDay().getYear() <= 1998)
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getIdUser, user -> user));

        System.out.println("Number of users: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBook = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication()>2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n"));
        System.out.println(theResultStringOfBook);

    }
}
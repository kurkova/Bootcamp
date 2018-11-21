package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "anonim", 'M', 1991, 3, 4, 21));
        usersList.add(new ForumUser(2, "programmer", 'F', 1999, 12, 21, 13));
        usersList.add(new ForumUser(3, "john", 'M', 1998, 12, 14, 23));
        usersList.add(new ForumUser(4, "snow", 'M', 1997, 3, 4, 15));
    }

    public List<ForumUser> getList() {
        return usersList;
    }
}


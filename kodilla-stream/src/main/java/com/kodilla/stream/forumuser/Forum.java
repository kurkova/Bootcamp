package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUser = new ArrayList<>();

    public Forum() {
        theUser.add(new ForumUser(1, "anonim", 'M', 1991, 3, 4, 21));
        theUser.add(new ForumUser(2, "programmer", 'F', 1999, 12, 21, 13));
        theUser.add(new ForumUser(3, "john", 'M', 1998, 11, 14, 23));
        theUser.add(new ForumUser(4, "snow", 'M', 1997, 3, 4, 15));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUser);
    }
}


package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();
    public Forum() {
        theUserList.add(new ForumUser(1, "alan01", 'm', LocalDate.of(2005, 1, 1), 5));
        theUserList.add(new ForumUser(2, "Dorothy", 'f', LocalDate.of(1997, 9, 23), 51));
        theUserList.add(new ForumUser(3, "Johnny123", 'm', LocalDate.of(1986, 12, 6), 63));
        theUserList.add(new ForumUser(4, "alan02", 'm', LocalDate.of(1999, 1, 16), 12));
        theUserList.add(new ForumUser(5, "Khloe", 'f', LocalDate.of(1988, 12, 13), 532));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}

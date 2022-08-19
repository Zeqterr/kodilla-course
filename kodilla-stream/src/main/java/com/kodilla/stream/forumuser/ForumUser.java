package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int posts;

    public ForumUser(int id, String username, char sex, LocalDate birthday, int posts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", posts=" + posts +
                '}';
    }
}


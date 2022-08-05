package com.kodilla.stream.immutable;

public final class ForumUser {
    private String username;
    private  String realName;

    private ForumUser forumuser(String username,String realName){
        this.username = username;
        this.realName = realName;
    }
    private String getUsername() {
        return username;
    }
    private String getRealName() {
        return realName;
    }
}

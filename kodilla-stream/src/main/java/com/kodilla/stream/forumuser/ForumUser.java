package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int IdUser;
    private final String username;
    private final char sex;
    private final LocalDate birthDay;
    private final int numberOfPosts;

    public ForumUser(final int idUser, final String username, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.IdUser = idUser;
        this.username = username;
        this.sex = sex;
        this.birthDay = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdUser() {
        return IdUser;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "Id user= " + IdUser +
                ", username= '" + username + '\'' +
                ", sex= " + sex +
                ", date of birth= " + birthDay +
                ", number Of Posts= " + numberOfPosts +
                '}';
    }
}

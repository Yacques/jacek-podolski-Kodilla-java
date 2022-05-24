package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int uniqueIdNumberOfUser;
    private final String userName;
    private final char sexOfUser;
    private final LocalDate dateOfBirth;
    private final int postsQuantityOfUser;

    public ForumUser(final int uniqueIdNumberOfUser, final String userName, final char sexOfUser,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postsQuantityOfUser) {
        this.uniqueIdNumberOfUser = uniqueIdNumberOfUser;
        this.userName = userName;
        this.sexOfUser = sexOfUser;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQuantityOfUser = postsQuantityOfUser;
    }

    public int getUniqueIdNumberOfUser() {
        return uniqueIdNumberOfUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSexOfUser() {
        return sexOfUser;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantityOfUser() {
        return postsQuantityOfUser;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueIdNumberOfUser=" + uniqueIdNumberOfUser +
                ", userName='" + userName + '\'' +
                ", sexOfUser=" + sexOfUser +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQuantityOfUser=" + postsQuantityOfUser +
                '}';
    }
}

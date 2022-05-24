package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> TheListOfForumUsers = new ArrayList<>();

    public Forum() {
        TheListOfForumUsers.add(new ForumUser(1, "Max Brown", 'M', 1989, 04, 12, 4));
        TheListOfForumUsers.add(new ForumUser(2, "Charlotte Duval", 'F', 1994, 06, 23, 7));
        TheListOfForumUsers.add(new ForumUser(3, "Kate Bush", 'F', 1980, 05, 11, 0));
        TheListOfForumUsers.add(new ForumUser(4, "James Orwell", 'M', 1968, 03, 23, 12));
        TheListOfForumUsers.add(new ForumUser(5, "David Knight", 'M', 1987, 12, 05, 0));
        TheListOfForumUsers.add(new ForumUser(6, "Erica Orson", 'F', 1976, 02, 17, 7));
        TheListOfForumUsers.add(new ForumUser(7, "Andrew Falcon", 'M', 1957, 11, 24, 4));
        TheListOfForumUsers.add(new ForumUser(8, "Angelina Sanders", 'F', 1982, 06, 11, 0));
        TheListOfForumUsers.add(new ForumUser(9, "Michel Berger", 'M', 1948, 07, 31, 9));
        TheListOfForumUsers.add(new ForumUser(10, "Henri Gonzales", 'M', 1976, 01, 25, 13));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(TheListOfForumUsers);
    }
}

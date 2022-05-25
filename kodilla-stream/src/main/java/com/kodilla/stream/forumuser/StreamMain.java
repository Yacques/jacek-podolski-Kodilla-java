package com.kodilla.stream.forumuser;


import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args){
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theForumUserMap = theForum.getUserList().stream()
                .filter(forumUser -> Objects.equals(forumUser.getSexOfUser(), 'M'))
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() > 2002)
                .filter(forumUser -> forumUser.getPostsQuantityOfUser() > 0)
                .collect(Collectors.toMap(ForumUser::getUniqueIdNumberOfUser, forumUser -> forumUser));

        theForumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}


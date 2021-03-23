package com.oop.developerHasRank;

public class Beginner extends DeveloperRank {

    @Override
    public void showDeveloperInfo(String name) {
        System.out.println("------- " + name + ": Beginner -------");
    }

}

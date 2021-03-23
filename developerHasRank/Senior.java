package com.oop.developerHasRank;

public class Senior extends DeveloperRank {

    @Override
    public void showDeveloperInfo(String name) {
        System.out.println("------- " + name + " : Senior -------");
    }

    @Override
    public void makeProgram() {
        System.out.println("Senior can make Good Program");
    }

    @Override
    public void designProgram() {
        System.out.println("Design Efficient Program");
    }

}

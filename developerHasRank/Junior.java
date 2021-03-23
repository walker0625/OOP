package com.oop.developerHasRank;

public class Junior extends DeveloperRank {

    @Override
    public void showDeveloperInfo(String name) {
        System.out.println("------- " + name + " : Junior -------");
    }

    @Override
    public void makeProgram() {
        System.out.println("Junior can make Running Program");
    }

}

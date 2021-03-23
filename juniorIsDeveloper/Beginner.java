package com.oop.juniorIsDeveloper;

public class Beginner extends Developer {

    public Beginner(String name) {
        this.name = name;
    }

    @Override
    public void showDeveloperInfo() {
        System.out.println("------- " + name + " : Beginner -------");
    }

    @Override
    public void makeProgram() {}

    @Override
    public void designProgram() {}

}

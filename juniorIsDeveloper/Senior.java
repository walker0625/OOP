package com.oop.juniorIsDeveloper;

public class Senior extends Developer {

    public Senior(String name) {
        this.name =name;
    }

    @Override
    public void showDeveloperInfo() {
        System.out.println("------- " + name + " : Senior -------");
    }

    @Override
    public void makeProgram() {
        System.out.println("Senior can make Well Working Program");
    }

    @Override
    public void designProgram() {
        System.out.println("Design Efficient Program");
    }

}

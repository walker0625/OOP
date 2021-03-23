package com.oop.juniorIsDeveloper;

public class Junior extends Developer {

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void showDeveloperInfo() {
        System.out.println("------- " + name + " : Junior -------");
    }

    @Override
    public void makeProgram() {
        System.out.println("Junior can make Working Program");
    }

    @Override
    public void designProgram() {}

}

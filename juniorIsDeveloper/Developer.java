package com.oop.juniorIsDeveloper;

public abstract class Developer implements Develop{
    protected String name;

    protected abstract void showDeveloperInfo();

    @Override
    public abstract void makeProgram();

    @Override
    public abstract void designProgram();

    public void develop() {
        showDeveloperInfo();
        learn();
        makeProgram();
        designProgram();
    }
}

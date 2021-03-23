package com.oop.developerHasRank;

public class Developer {
    private String name;
    private DeveloperRank developerRank;

    public Developer(String name, DeveloperRank developerRank) {
        this.name = name;
        this.developerRank = developerRank;
    }

    public void develop() {
        developerRank.showDeveloperInfo(name);
        developerRank.learn();
        if( developerRank instanceof Junior || developerRank instanceof Senior) {
            developerRank.makeProgram();
        }

        if(developerRank instanceof Senior) {
            developerRank.designProgram();
        }
    }

}

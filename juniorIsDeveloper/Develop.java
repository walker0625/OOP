package com.oop.juniorIsDeveloper;

public interface Develop {
    default void learn() {
        System.out.println("Keep Learning");
    };
    void makeProgram();
    void designProgram();
}

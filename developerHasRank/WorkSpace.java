package com.oop.developerHasRank;

import java.util.Arrays;
import java.util.List;

public class WorkSpace {

    public static void main(String[] args) {
        Developer hello = new Developer("World", new Beginner());
        Developer jeon = new Developer("Minwoo", new Junior());
        Developer martin = new Developer("Fowler", new Senior());

        List<Developer> developers = Arrays.asList(hello, jeon, martin);

        developers.forEach(Developer::develop);
    }

}

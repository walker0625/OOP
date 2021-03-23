package com.oop.juniorIsDeveloper;

import java.util.Arrays;
import java.util.List;

public class WorkSpace {

    public static void main(String[] args) {
        Developer hello = new Beginner("World");
        Developer jeon = new Junior("Minwoo");
        Developer martin = new Senior("Fowler");

        List<Developer> developers = Arrays.asList(hello, jeon, martin);

        developers.forEach(Developer::develop);
    }

}

package nl.lennertgijsen.java8demo.model;

/**
 * Created by Lennert on 2016-11-23.
 */
public class Giraffe implements Animal {
    private final String name;

    public Giraffe() {
        this.name = null;
    }

    public String getName() {
        return name;
    }

    public boolean hasTail() {
        return true;
    }

    public boolean makesSound() {
        return false;
    }

    public int getAverageWeightGrams() {
        return 400000;
    }
}

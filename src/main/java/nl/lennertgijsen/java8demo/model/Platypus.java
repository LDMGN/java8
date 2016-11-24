package nl.lennertgijsen.java8demo.model;

import com.google.common.base.Strings;

import java.util.Optional;

/**
 * Created by Lennert on 2016-11-23.
 */
public class Platypus implements Animal {
    private final String name;
    private final Optional<String> niceName;

    public Platypus() {
        this.name = null;
        niceName = Optional.empty();
    }

    public Platypus(final String name) {
        this.name = name;
        niceName=Optional.ofNullable(Strings.emptyToNull(name));
    }

    public String getName() {
        return name;
    }

    public Optional<String> getNiceName() {
        return niceName;
    }

    public boolean hasTail() {
        return true;
    }

    public boolean makesSound() {
        return true;
    }

    public int getAverageWeightGrams() {
        return 5000;
    }
}

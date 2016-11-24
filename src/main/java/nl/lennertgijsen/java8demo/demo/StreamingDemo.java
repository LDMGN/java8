package nl.lennertgijsen.java8demo.demo;

import nl.lennertgijsen.java8demo.model.Animal;
import nl.lennertgijsen.java8demo.model.Giraffe;
import nl.lennertgijsen.java8demo.model.Platypus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lennert on 2016-11-23.
 */
public class StreamingDemo implements Demo {
    public void demonstrate() {
        final List<Animal> animals = new ArrayList() {{
            add(new Platypus());
            add(new Platypus());
            add(new Giraffe());
        }};

        final long numAnimalsMakingSound = animals.stream().filter(Animal::makesSound).count();
    }
}
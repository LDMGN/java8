package nl.lennertgijsen.java8demo.demo;

import nl.lennertgijsen.java8demo.model.Animal;
import nl.lennertgijsen.java8demo.model.Platypus;

import java.util.Optional;

/**
 * Created by Lennert on 2016-11-23.
 */
public class OptionalDemo implements Demo {
    public void demonstrate() {
        final Optional<Animal> animal = Optional.of(new Platypus());
        final Optional<Animal> animal2 = Optional.ofNullable(null);

        final Optional<Animal> perry = Optional.of(new Platypus("Perry"));
        final Optional<String> name = perry.map(p -> {
            return p.getName();
        });

        final Optional<String> nameShorter = perry.map(Animal::getName);
        final Optional<String> nameIfAudible = perry.filter(Animal::makesSound).map(Animal::getName);
    }
}

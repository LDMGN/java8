package nl.lennertgijsen.java8demo;

import nl.lennertgijsen.java8demo.demo.Demo;
import nl.lennertgijsen.java8demo.demo.OptionalDemo;
import nl.lennertgijsen.java8demo.demo.StreamingDemo;

/**
 * Created by Lennert on 2016-11-23.
 */
public class Main {
    public static void main(final String[] args) {
        Demo[] demos = {new OptionalDemo(), new StreamingDemo()};
        for (Demo demo : demos) {
            demo.demonstrate();
        }
    }
}

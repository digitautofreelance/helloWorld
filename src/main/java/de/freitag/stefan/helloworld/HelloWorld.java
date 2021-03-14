package de.freitag.stefan.helloworld;

import java.util.function.Consumer;

public final class HelloWorld {

    private HelloWorld(){
        //empty method
    }

    /**
     * Entry point of this application.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello World");
    }
}
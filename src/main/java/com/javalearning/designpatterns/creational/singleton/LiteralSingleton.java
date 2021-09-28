package com.javalearning.designpatterns.creational.singleton;

public class LiteralSingleton {
    private LiteralSingleton instance;

    private LiteralSingleton() {
    }

    public LiteralSingleton getInstance() {
        if (this.instance == null) {
            // Lock goes here to enable multithreaded support, this should be a protected area. Mutex or semaphore.
            this.instance = new LiteralSingleton();
        }
        return this.instance;
    }
}

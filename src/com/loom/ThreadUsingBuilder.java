package com.loom;

public class ThreadUsingBuilder {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Building A vThread using thread builder and then starting it.
         */
        Thread.Builder threadBuilder = Thread.builder().virtual().task(() -> {
            System.out.println("Hello, Loom! " + Thread.currentThread().getName());
        }).name("VThreadWithName");
        Thread vThreadWithName = threadBuilder.start();
        vThreadWithName.join();
    }
}

package com.loom;

import java.util.concurrent.ThreadFactory;

public class ThreadUsingFactory {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Creating a virtual thread using Thread factory
         */
        ThreadFactory tf = Thread.builder().virtual().factory();

        Thread t1 = tf.newThread(() -> System.out.println("Hello Loom !"));
        Thread t2 = tf.newThread(() -> System.out.println("Hello Loom !"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

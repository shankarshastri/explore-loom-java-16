package com.loom;

import static java.lang.Thread.*;

public class StartVThreadDirectly {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Starts a virtual thread directly
         */
        Thread virtualThread = startVirtualThread(() -> {
            System.out.println("Hello, Loom!");
        });

        virtualThread.join();
    }
}

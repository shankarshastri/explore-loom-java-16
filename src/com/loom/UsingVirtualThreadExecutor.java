package com.loom;

import java.time.Instant;
import java.util.concurrent.*;

public class UsingVirtualThreadExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * Virtual Thread Executor With Deadline Of 1 seconds/task
         */
        ExecutorService e = Executors.newVirtualThreadExecutor()
                .withDeadline(Instant.now().plusSeconds(1));
        Future<Integer> f = e.submit(() -> {
            System.out.println("Hello Loom !!");
            return 0;
        });
        CompletableFuture<Integer> c = e.submitTask(() -> {
            // Thread.sleep(1000); //Remove To Verify Deadline.
            System.out.println("Hello Loom !!");
            return 0;
        });

        f.get();
        c.get();
    }
}

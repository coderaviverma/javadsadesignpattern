package com.coderaviverma.springtestDummy.java.threads;

import java.util.concurrent.*;

public class ExecutorsMain {


    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(2,4,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2),
            new CustomThreadFactory(), new CustomRejectionHandler());


        for (int i = 0; i < 7; i++) {
            threadPoolExecutor.submit(()-> {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(" Running - " +Thread.currentThread().getName());

            });

        }

        threadPoolExecutor.shutdown();

    }

}

class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread thread=new Thread(r);
        thread.setDaemon(false);
        thread.setPriority(10);
        thread.setName("Avi "+thread.getName());
        return thread;
    }
}

class CustomRejectionHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

        System.out.println(" Custom rejection Handler - "+r.toString());
    }
}

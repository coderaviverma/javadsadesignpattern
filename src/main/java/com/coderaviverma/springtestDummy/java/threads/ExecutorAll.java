import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;//package com.coderaviverma.springtestDummy.java.threads;
//
//import java.util.List;
//import java.util.concurrent.*;
//
//import static java.lang.Thread.sleep;
//
//
//public class ExecutorAll {
//
//    public static void main(String[] args) {
//
//        Runnable myRunnable=()-> System.out.println("Thread RUnning");
//
//        //Simple executor
//        Executor executor= command -> {
//            new Thread(command);
//        };
//
//        ExecutorService singleThreadExecutor= Executors.newSingleThreadExecutor();
//        singleThreadExecutor.execute(()-> {
//
//        });
//
//        ExecutorService fixedThreadPool=Executors.newFixedThreadPool(3);
//        fixedThreadPool.execute(()->{});
//
//        //wait for existing task to finish
//        fixedThreadPool.shutdown();
//
//        //Attempting to stop all thread and return awaiting list
//        List<Runnable> runnables = fixedThreadPool.shutdownNow();
//
//        ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(3);
//        scheduledExecutorService.schedule(myRunnable,1000,TimeUnit.MINUTES);
//        scheduledExecutorService.scheduleAtFixedRate(myRunnable,1,2,TimeUnit.MINUTES);
//
//        //Custom Threadpool Executor
//        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(
//                2,//core
//                4,//max thread
//                10,TimeUnit.SECONDS,//ideal thread timeout
//                new LinkedBlockingDeque<>(2),//task queue
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
//        );
//
//        threadPoolExecutor.execute(()-> System.out.println("custom thread pool"));
//
////
////        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync().thenApply().thenAccept();
////        voidCompletableFuture.get();
//
//
//
////        Running Multiple Tasks in Parallel
//        CompletableFuture<String> f1=CompletableFuture.supplyAsync(()-> "Process 1");
//        CompletableFuture<String> f2=CompletableFuture.supplyAsync(()-> "Process 2");
//
//        CompletableFuture<String> combine = f1.thenCombine(f2,(a,b)-> a +" "+b);
//        System.out.println(combine.join());
//
//
////        With Exception Handling
//        CompletableFuture<String> e1=CompletableFuture.supplyAsync(()->{
//            if(true) throw new RuntimeException("Opps");
//            return "OK";
//        }).exceptionally( ex -> "Recoverd "+ ex.getMessage());
//        System.out.println(e1.join());
//
//        try {
//            e1.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//        //Combine all Completable Future
//        ExecutorService executorService=Executors.newFixedThreadPool(2);
//
//        CompletableFuture<String> c1 = CompletableFuture.supplyAsync(() -> {
//            sleep(3000);
//            return "User: Avinash Verma";
//        }, executorService);
//
//        CompletableFuture<String> c2 = CompletableFuture.supplyAsync(() -> {
//            sleep(3000);
//            return "User: Avinash Verma";
//        }, executorService);
//
//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(c1, c2);
//
//        voidCompletableFuture.thenRun(()->{
//
//        }).join();
//
//        executorService.shutdown();//release thread
//    }
//
//
//    class MyRunnable implements Runnable{
//
//        @Override
//        public void run() {
//            System.out.println( " Executing ");
//        }
//    }
//}

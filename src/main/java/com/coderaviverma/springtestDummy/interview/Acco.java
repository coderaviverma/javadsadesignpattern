package com.coderaviverma.springtestDummy.interview;

public class Acco {


    private static Object lock =new Object();
    private static int count = 0 ;
    private static int i = 20;

    public static void main(String[] args) {
        Object lock = new Object();
         int count = 1;
        Thread even = new Thread(new Even());
        Thread odd = new Thread(new Odd());
        even.start();
        odd.start();



    }

    static class Even implements Runnable {
        public Even() {
        }

        @Override
        public void run() {

            while (i > count) {
                synchronized (lock) {
                    while (count % 2 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("Even " + count);
                    count++;
                    lock.notifyAll();

                }
            }


        }
    }

    static class Odd implements Runnable {

        private Odd() {

        }

        @Override
        public void run() {

                while (i > count) {
                    synchronized (lock) {

                        while (count % 2 == 0) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }

                        System.out.println("Odd " + count++);
                        lock.notifyAll();

                    }
                }



        }
    }


}

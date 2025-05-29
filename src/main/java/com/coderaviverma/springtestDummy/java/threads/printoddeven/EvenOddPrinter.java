package com.coderaviverma.springtestDummy.java.threads.printoddeven;

public class EvenOddPrinter {

    private Object lock=new Object();
    private  int count=20;
    private int number = 1;
    public static void main(String[] args) {
        EvenOddPrinter printer=new EvenOddPrinter();
        Thread t1=new Thread(printer::even,"Even thread");
        Thread t2=new Thread(printer::odd,"Odd thread");

        t1.start();
        t2.start();
    }


    private void even(){

        while (number<=count){

            synchronized (lock){

                while (number%2!=0){
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }

                if (number<=count){

                    System.out.println("Current thread - "+Thread.currentThread().getName() +" even number -- "+number++);
                    lock.notifyAll();
                }

            }

        }
    }


    private void odd(){

        while (number<=count){

            synchronized (lock){

                while (number%2==0){
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }

                if (number<=count){

                    System.out.println("Current thread - "+Thread.currentThread().getName() +" odd number -- "+number++);
                    lock.notifyAll();
                }

            }

        }
    }
}

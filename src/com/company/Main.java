package com.company;

import java.util.Random;

public class Main {
    public static int count = 1;
    public static final Object locker = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (locker) {
                        if (count % 5 == 0) {
                            locker.notifyAll();
                        }
                    }
                        try {
                            Thread.sleep(1000);
                            System.out.println("Time session " + count++);

                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
        });
        thread.start();
        Thread thread1 = new Thread(new TimeSession());
        thread1.start();
    }
}

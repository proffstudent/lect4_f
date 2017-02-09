package com.company;

import static com.company.Main.locker;
/**
 * Created by User on 09.02.2017.
 */
public class TimeSession implements Runnable {
    public static int temp = 0;
    @Override
    public void run() {
        while (true) {
            try {
                synchronized (locker) {
                    locker.wait();
                    System.out.println("message");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }





    }
}

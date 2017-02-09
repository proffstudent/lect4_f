package com.company;

/**
 * Created by User on 09.02.2017.
 */
public class AnotherThread extends Thread {

    public static void sendData(){
        synchronized (Main.locker){
            try{
                //Thread.sleep(10000);
                Main.locker.wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println("Message send!!!");
        }

    }
}

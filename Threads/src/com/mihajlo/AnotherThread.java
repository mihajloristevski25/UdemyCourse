package com.mihajlo;

import static com.mihajlo.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{

    @Override
    public void run(){
        System.out.println(ANSI_BLUE + "Hello from "+ currentThread().getName());

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Another Thread woke me up!");
            return;
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}

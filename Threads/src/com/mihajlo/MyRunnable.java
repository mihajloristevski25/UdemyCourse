package com.mihajlo;

import static com.mihajlo.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's imlementation run().");
    }
}

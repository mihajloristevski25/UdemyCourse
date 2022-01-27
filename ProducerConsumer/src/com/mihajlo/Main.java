package com.mihajlo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static com.mihajlo.Main.EOF;

public class Main {

    public static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
        ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_CYAN);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE );

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_GREEN + "I'm being printed from the callable class");
                return "This is a callable result";
            }
        });

        try {
            System.out.println(future.get());
        }catch (ExecutionException e){
            System.out.println("Something went wrong");
        }catch (InterruptedException e){
            System.out.println("Thread running the task was interrupted");
        }

        executorService.shutdown();
    }
}

class MyProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run(){
        Random random = new Random();
        String[] nums = {"1" , "2", "3" , "4" , "5"};

        for (String num : nums){
            try{
                System.out.println(color + "Adding..." + num);
                buffer.put(num);

                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(color + "Adding to EOF and exiting...");
        try {
            buffer.put("EOF");
        }catch (InterruptedException e){

        }
    }
}

class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {

        while (true) {
            synchronized (buffer){
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + " Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.take());
                    }
                } catch (InterruptedException e) {

                }
            }
        }
    }
}





































// Buffer lock/unclock ReentrantLock

//package com.mihajlo;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.*;
//import java.util.concurrent.locks.ReentrantLock;
//
//import static com.mihajlo.Main.EOF;
//
//public class Main {
//
//    public static final String EOF = "EOF";
//
//    public static void main(String[] args) {
//	    List<String> buffer = new ArrayList<>();
//        ReentrantLock bufferLock = new ReentrantLock();
//
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_CYAN , bufferLock);
//        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE , bufferLock);
//        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE , bufferLock);
//
//        executorService.execute(producer);
//        executorService.execute(consumer1);
//        executorService.execute(consumer2);
//
//        Future<String> future = executorService.submit(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                System.out.println(ThreadColor.ANSI_GREEN + "I'm being printed from the callable class");
//                return "This is a callable result";
//            }
//        });
//
//        try {
//            System.out.println(future.get());
//        }catch (ExecutionException e){
//            System.out.println("Something went wrong");
//        }catch (InterruptedException e){
//            System.out.println("Thread running the task was interrupted");
//        }
//
//        executorService.shutdown();
//    }
//}
//
//class MyProducer implements Runnable {
//    private List<String> buffer;
//    private String color;
//    private ReentrantLock bufferLock;
//
//    public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
//        this.buffer = buffer;
//        this.color = color;
//        this.bufferLock = bufferLock;
//    }
//
//    public void run(){
//        Random random = new Random();
//        String[] nums = {"1" , "2", "3" , "4" , "5"};
//
//        for (String num : nums){
//            try{
//                System.out.println(color + "Adding..." + num);
//                bufferLock.lock();
//                try{
//                    buffer.add(num);
//                }finally {
//                    bufferLock.unlock();
//                }
//
//                Thread.sleep(random.nextInt(1000));
//            }catch (InterruptedException e){
//                System.out.println("Producer was interrupted");
//            }
//        }
//
//        System.out.println(color + "Adding to EOF and exiting...");
//        bufferLock.lock();
//        try {
//            buffer.add("EOF");
//        }finally {
//            bufferLock.unlock();
//        }
//
//
//    }
//}
//
//class MyConsumer implements Runnable {
//    private List<String> buffer;
//    private String color;
//    private ReentrantLock bufferLock;
//
//    public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
//        this.buffer = buffer;
//        this.color = color;
//        this.bufferLock = bufferLock;
//    }
//
//    public void run() {
//
//        int counter = 0;
//
//        while (true) {
//            if (bufferLock.tryLock()) {
//                try {
//                    if (buffer.isEmpty()) {
//                        continue;
//                    }
//                    System.out.println(color + "The counter = " + counter);
//                    counter = 0;
//
//                    if (buffer.get(0).equals(EOF)) {
//                        System.out.println(color + " Exiting");
//                        break;
//                    } else {
//                        System.out.println(color + "Removed " + buffer.remove(0));
//                    }
//                } finally {
//                    bufferLock.unlock();
//                }
//            }else {
//                counter++;
//            }
//        }
//    }
//}

package com.weilf.threaddemo.runnable;

/**
 * Package: com.weilf.threaddemo.runnable
 * Date: Created in 2019-09-21 11:02
 *
 * @Version: 1.0.0
 * @author: weilai
 */
public class RunnableMain {
    public static void main(String[] args) {
        RunnableA runnableA = new RunnableA();
        RunnableB runnableB = new RunnableB();
        Thread thread1 = new Thread(runnableA);
        thread1.setName("A");
        Thread thread2 = new Thread(runnableB);
        thread2.setName("B");
        thread1.start();
        thread2.start();
    }
}

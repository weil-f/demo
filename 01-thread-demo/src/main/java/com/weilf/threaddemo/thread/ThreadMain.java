package com.weilf.threaddemo.thread;

/**
 * Package: com.weilf.threaddemo.thread
 * Date: Created in 2019-09-21 10:56
 *
 * @Version: 1.0.0
 * @author: weilai
 */
public class ThreadMain {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("线程A");
        ThreadB threadB = new ThreadB();
        threadB.setName("线程B");
        threadA.start();
        threadB.start();
    }
}

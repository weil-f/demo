package com.weilf.sync;

/**
 * Package: com.weilf.sync
 * Date: Created in 2019-09-21 11:27
 * 线程不安全的模拟卖票窗口
 * @Version: 1.0.0
 * @author: weilai
 */
public class NoSyncTicketWindow implements Runnable {
    private int size = 10;


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (size == 0){
                return;
            }
            System.err.println("当前线程名为"+Thread.currentThread().getName()+"卖出了第"+size+"张车票");
            size --;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

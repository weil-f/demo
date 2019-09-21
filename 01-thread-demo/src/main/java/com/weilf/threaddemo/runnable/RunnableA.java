package com.weilf.threaddemo.runnable;

/**
 * Package: com.weilf.threaddemo.runnable
 * Date: Created in 2019-09-21 11:00
 * 实现Runnable 专门打印10次1
 * @Version: 1.0.0
 * @author: weilai
 */
public class RunnableA implements Runnable{
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
            System.out.println("当前线程名为"+Thread.currentThread().getName()+"打印了第"+i+"次"+1);
        }
    }
}

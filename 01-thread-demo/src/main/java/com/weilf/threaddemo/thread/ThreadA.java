package com.weilf.threaddemo.thread;

/**
 * Package: com.weilf.threaddemo.thread
 * Date: Created in 2019-09-21 10:53
 * 继承Thread专门打印10次1的线程
 * @Version: 1.0.0
 * @author: weilai
 */
public class ThreadA  extends Thread{
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("当前线程名为"+Thread.currentThread().getName()+"打印了第"+i+"次"+1);
        }
    }
}

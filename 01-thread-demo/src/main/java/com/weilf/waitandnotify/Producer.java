package com.weilf.waitandnotify;

/**
 * Package: com.weilf.waitandnotify
 * Date: Created in 2019-09-21 11:54
 * 生产者
 * @Version: 1.0.0
 * @author: weilai
 */
public class Producer extends Thread{
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
        while (true){
            synchronized (Kuang.list){
                if(Kuang.list.size() == 20){
                    try {
                        Kuang.list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Kuang.list.add("苹果");
                System.out.println("生产者生产了一个苹果,筐中还剩"+Kuang.list.size()+"个苹果");
                Kuang.list.notify();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

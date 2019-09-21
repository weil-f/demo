package com.weilf.waitandnotify;

/**
 * Package: com.weilf.waitandnotify
 * Date: Created in 2019-09-21 11:54
 * 消费者
 * @Version: 1.0.0
 * @author: weilai
 */
public class Consumer extends Thread{
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
                if(Kuang.list.size() == 0){
                    try {
                        Kuang.list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Kuang.list.remove(0);
                System.err.println("消费者消费了一个苹果,筐中还剩下" + Kuang.list.size() + "个苹果");
                Kuang.list.notify();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}

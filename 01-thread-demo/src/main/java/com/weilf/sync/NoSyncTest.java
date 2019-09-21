package com.weilf.sync;

/**
 * Package: com.weilf.sync
 * Date: Created in 2019-09-21 11:30
 * 线程不安全的测试类
 * @Version: 1.0.0
 * @author: weilai
 */
public class NoSyncTest {
    public static void main(String[] args) {
        NoSyncTicketWindow noSyncTicketWindow = new NoSyncTicketWindow();
        Thread thread1 = new Thread(noSyncTicketWindow);
        thread1.setName("A");
        Thread thread2 = new Thread(noSyncTicketWindow);
        thread2.setName("B");
        thread1.start();
        thread2.start();
    }
}

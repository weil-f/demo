package com.weilf.sync;

/**
 * Package: com.weilf.sync
 * Date: Created in 2019-09-21 11:34
 *
 * @Version: 1.0.0
 * @author: weilai
 */
public class SyncTest {
    public static void main(String[] args) {
        SyncTicketWindow syncTicketWindow = new SyncTicketWindow();
        Thread thread1 = new Thread(syncTicketWindow);
        thread1.setName("A");
        Thread thread2 = new Thread(syncTicketWindow);
        thread2.setName("B");
        thread1.start();
        thread2.start();
    }
}

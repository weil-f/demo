package com.weilf.waitandnotify;

/**
 * Package: com.weilf.waitandnotify
 * Date: Created in 2019-09-21 13:00
 *
 * @Version: 1.0.0
 * @author: weilai
 */
public class WaitAndNotifyTest {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        Producer producer = new Producer();
        producer.start();
        consumer.start();
    }
}

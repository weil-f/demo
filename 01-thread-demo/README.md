## 这是一个多线程的练习类
- 实现多线程有两种方式
    - 继承Thread类
    - 实现Runnable 接口
- 实现线程安全的方法
    - 加锁synchronized
- 线程间的通信
    - wait()释放锁，等待唤醒
    - notify()唤醒线程
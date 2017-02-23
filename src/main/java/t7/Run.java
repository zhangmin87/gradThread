package t7;

/**
 * Created by zhongdepeng on 2017/2/6.
 */

/**
 * synchronized 快中就是异步执行，在
 * synchronized快中就是同步执行
 *
 */
public class Run {
    public static void main(String[] args) {
        Task task=new Task();
        MyThread1 thread1=new MyThread1(task);
        thread1.start();
        MyThread2 thread2=new MyThread2(task);
        thread2.start();
    }
}

package t18;

/**
 * Created by zhongdepeng on 2016/12/27.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority="+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority="+Thread.currentThread());
        MyThread1 thread1=new MyThread1();
        thread1.start();
    }
}

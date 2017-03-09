package wait_notify_size5;

/**
 * Created by zhongdepeng on 2017/3/9.
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

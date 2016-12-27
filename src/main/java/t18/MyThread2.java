package t18;

/**
 * Created by zhongdepeng on 2016/12/27.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority="+this.getPriority());
    }
}

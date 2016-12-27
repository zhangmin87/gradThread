package t18;

/**
 * Created by zhongdepeng on 2016/12/27.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread run priority="+this.getPriority());
        MyThread1 myThread1=new MyThread1();
        myThread1.start();
    }
}

package synStaticMethod;

/**
 * Created by zhongdepeng on 2017/2/22.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}

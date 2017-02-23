package synStaticMethod;

/**
 * Created by zhongdepeng on 2017/2/22.
 */
public class ThreadA extends  Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
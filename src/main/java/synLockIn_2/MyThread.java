package synLockIn_2;

/**
 * Created by zhongdepeng on 2017/1/20.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub=new Sub();
        sub.operateIMainMethod();
    }
}

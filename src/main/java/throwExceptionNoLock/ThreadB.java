package throwExceptionNoLock;

/**
 * Created by zhongdepeng on 2017/1/20.
 */
public class ThreadB extends Thread {
    private Service servece;
    public ThreadB(Service servece){
        this.servece=servece;
    }

    @Override
    public void run() {
           servece.testMethod();
    }
}


package synBlockString2;



/**
 * Created by zhongdepeng on 2017/2/20.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {

    }
}

package twoStop;

/**
 * Created by zhongdepeng on 2017/2/24.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}

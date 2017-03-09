package synMoreObjectStaticOneLock;

/**
 * Created by zhongdepeng on 2017/2/23.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        this.service=service;
    }

    @Override
    public void run() {
        service.printA();
    }
}

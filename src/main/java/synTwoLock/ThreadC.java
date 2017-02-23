package synTwoLock;

/**
 * Created by zhongdepeng on 2017/2/22.
 */
public class ThreadC extends Thread {
    private Service service;
    public ThreadC(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.printC();
    }
}

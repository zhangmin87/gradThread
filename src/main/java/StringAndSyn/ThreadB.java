package StringAndSyn;

/**
 * Created by zhongdepeng on 2017/2/23.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }
    @Override
    public void run() {
        service.print("AA");
    }
}

package StringAndSyn2;

/**
 * Created by zhongdepeng on 2017/2/24.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}

package synchronizedOneThreadIn;

/**
 * Created by zhongdepeng on 2017/1/25.
 */
public class ThreadA extends Thread {
    private ObjectService service;
    public ThreadA(ObjectService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}

package synchronizedOneThreadIn;

/**
 * Created by zhongdepeng on 2017/1/25.
 */
public class ThreadB extends Thread {
    private ObjectService service;
    public ThreadB(ObjectService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}

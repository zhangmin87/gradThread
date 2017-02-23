package doubleSynBlockOneTwo;

/**
 * Created by zhongdepeng on 2017/2/6.
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
        service.serviceMethodB();
    }
}

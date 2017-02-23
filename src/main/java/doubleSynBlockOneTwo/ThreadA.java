package doubleSynBlockOneTwo;

/**
 * Created by zhongdepeng on 2017/2/6.
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
        service.serviceMethodA();
    }
}

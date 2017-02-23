package Service;



/**
 * Created by ZHANGMIN on 2017/2/20.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.serUsernamePassword("a","aa");
    }
}

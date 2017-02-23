package synBlockString2;

/**
 * Created by zhongdepeng on 2017/2/20.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }
    public void run(){
        service.b();
    }
}

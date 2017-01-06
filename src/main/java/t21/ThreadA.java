package t21;

/**
 * Created by zhongdepeng on 2017/1/4.
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum numSelf;
    public ThreadA(HasSelfPrivateNum numSelf){
        super();
        this.numSelf=numSelf;
    }

    @Override
    public void run() {
        super.run();
        numSelf.addI("a");
    }
}

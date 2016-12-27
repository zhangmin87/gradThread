package t16;

/**
 * Created by zhongdepeng on 2016/12/26.
 */
public class Run {
    public static void main(String[] args) throws  Exception {
        Mythread mythread=new Mythread();
        mythread.start();
        Thread.sleep(2000);
        mythread.interrupt();
}
}

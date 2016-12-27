package t15_1;

/**
 * Created by zhongdepeng on 2016/12/26.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        myThread.interrupt();
    }
}

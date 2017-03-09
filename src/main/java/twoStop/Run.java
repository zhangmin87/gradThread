package twoStop;

/**
 * Created by zhongdepeng on 2017/2/24.
 * 同步方法容易造成死循环，
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA althread=new ThreadA(service);
        althread.start();
        ThreadB threadB=new ThreadB(service);
        threadB.start();
    }
}

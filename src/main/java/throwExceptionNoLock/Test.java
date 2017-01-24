package throwExceptionNoLock;

import synLogkIn_1.*;

/**
 * Created by zhongdepeng on 2017/1/20.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Service service=new Service();
            ThreadA a=new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(5000);
            ThreadB b=new ThreadB(service);
            b.setName("b");
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
/**
 *  当一个线程执行的代码出现异常时，其所特有的锁会自动释放锁，线程b进入方法正常打印，结论是
 * 出现异常的锁被自动释放
 */
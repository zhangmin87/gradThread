package test2;

/**
 * Created by zhongdepeng on 2017/3/9.
 * 但线程不能永远等待下去，
 *
 */
public class Test {
    public static void main(String[] args) {
        try{
            Object lock=new Object();
            MyThread1 t1=new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2=new MyThread2(lock);
            t2.start();
        }catch (InterruptedException e){

        }

    }
}

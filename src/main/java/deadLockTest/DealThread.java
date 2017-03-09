package deadLockTest;

import twoStop.ThreadB;

/**
 * Created by zhongdepeng on 2017/2/24.
 * java 多线程四所是一个经典的多线程问题，因为不同的线程
 * 都在等待根本不可以能被释放的的锁，从而
 * 导致所有的任务都无法继续完成，在多线程技术中
 * "死锁"必须避免的，因为这会造成线程的""假死
 * 创建名称为deadLockTest项目
 */
public class DealThread implements  Runnable {
    public String username;
    public Object lock1=new Object();
    public Object lock2=new Object();
    public void setFlag(String username){
        this.username=username;
    }
    public void run() {
        if(username.equals("a")){
            synchronized (lock1){
                try{
                    System.out.println("username="+username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按lock1->lock2代码顺序执行");
                }
            }
        }
        if(username.equals("b")){
            synchronized (lock2){
                try{
                    System.out.println("username="+username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            synchronized (lock1){
                System.out.println("按lock2->lock1代码顺序执行");
            }
        }
    }
}

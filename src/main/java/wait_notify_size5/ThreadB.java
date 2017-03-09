package wait_notify_size5;

/**
 * Created by zhongdepeng on 2017/3/9.
 * 用一句话来总结一下wait和notify:wait使用线程停止运行
 * 而notify使停止的线程继续运行,notifyAll()方法进行可以运行
 * 状态，也就是notify()方法仅增加了""一个线程
 * notifyAll()方法可以使用所有正在等待队列中同一共享资源
 * 的""全部从等待状态退出，进入可进行运行状态，此时,优先级最高
 * 的那个线程最先执行，但也有可能是随机执行，因为这要取决于
 * JVM虚拟机的实现
 * 在前面的章节中已经介绍了与Thread有关的大部分，优先级
 * 最高的那个线程最先执行，但也有可能是随机执行，因为这要
 * 取决于JVM虚拟机的实现
 * */
public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock=lock;
    }
    @Override
    public void run() {
        try{
            synchronized (lock){
                for(int i=0;i<10;i++){
                    MyList.add();
                    if(MyList.size()==5){
                      lock.notify();
                      System.out.println("已发出通知！");
                    }
                    System.out.println("添加了"+(i+1)+"个元素");
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

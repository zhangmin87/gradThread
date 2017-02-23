package t7;

/**
 * Created by zhongdepeng on 2017/2/6.
 * s
 */
public class Task {
    public void doLongTimeTask(){
        for(int i=0;i<100;i++){
            System.out.println("nosynchronized threadName="+Thread.currentThread().getName()+"i="+(i+1));
        }
        System.out.println("________");
        /*
         *synchronized 快中就是异步执行，在synchonized快中就是同步执行
         */
        synchronized (this){
            for(int i=0;i<100;i++){
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+"i="+(i+1));
            }
        }
    }
}

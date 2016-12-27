package t12;

import t11.*;

/**
 * Created by zhongdepeng on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){

        //测试当前线程是否已经中断，线程的中断状态由该方法清除，
        //换句话说，如果当前线程再次中断的情况除外
        //interrupted()方法具有清除状态的功能，所以第二次调用
        //interrupted()方法返回的值是false
        //isInterruped()方法，
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？="+Thread.interrupted());
            System.out.println("是否停止2？="+Thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end！");
    }
}

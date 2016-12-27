package t13_1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.InterruptedIOException;

/**
 * Created by zhongdepeng on 2016/12/23.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态！我要退出");
                    throw  new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我是在for下面");
        }catch (InterruptedException e){
            System.out.println("进MyThread.java类run方法中catch中");
            e.printStackTrace();
        }
    }
}

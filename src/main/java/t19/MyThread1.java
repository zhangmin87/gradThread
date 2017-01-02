package t19;

import t18.MyThread2;

import javax.annotation.Resources;
import java.util.Random;

/**
 * Created by Administrator on 2017/1/1.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime=System.currentTimeMillis();
        long addResult=0;
        for(int j=0;j<10;j++){
            for(int i=0;i<50000;i++){
                Random random=new Random();
                random.nextInt();
                addResult=addResult+ i;
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("***** thread  I use time="+(endTime-beginTime));
    }
}

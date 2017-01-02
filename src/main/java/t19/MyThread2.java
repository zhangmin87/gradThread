package t19;

import java.util.Random;

/**
 * Created by Administrator on 2017/1/1.
 */
public class MyThread2  extends  Thread{
    @Override
    public void run() {
        long beginTime=System.currentTimeMillis();
        long addResult=0;
        for(int j=0;j<10;j++){
            for(int i=0;i<5000;i++){
                Random random=new Random();
                random.nextInt();
                addResult=addResult+1;
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("******* thread2 use time="+(endTime-beginTime));

    }
}

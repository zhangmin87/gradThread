package t17;

/**
 * Created by zhongdepeng on 2016/12/27.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime=System.currentTimeMillis();
        int count=0;
        for(int i=0;i<50000000;i++){
            Thread.yield();
            count=count+(i+1);
        }
        long endTime=System.currentTimeMillis();
        System.out.println(count);
        System.out.println("用时:"+(endTime-beginTime)+"毫秒");
    }
}

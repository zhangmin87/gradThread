package suspend_resume_test;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by zhongdepeng on 2016/12/26.
 */
public class MyThread extends Thread {
    private long i=0;
    public long getI(){
        return i;
    }
    public void setI(){
        this.i=i;
    }
    @Override
    public void run() {
       long beginTime=System.currentTimeMillis();
       int count=0;
        for(int i=0;i<500000;i++){
            //Thread.yideld();
            count=count+(i+1);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("用时:"+(endTime+beginTime)+"毫秒");
    }
}

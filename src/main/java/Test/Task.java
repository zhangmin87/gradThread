package Test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by zhongdepeng on 2017/1/24.
 */
public class Task {
    private String getData1;
    private String getData2;
    public synchronized void doLongTimeTask(){
        try{
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1="长时间处理任务后从远程返回的值1 threadName="+Thread.currentThread().getName();
            getData2="长时间处理任务从远程返回的值2 threadNam="+Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
            }
}

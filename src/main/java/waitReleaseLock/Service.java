package waitReleaseLock;

/**
 * Created by zhongdepeng on 2017/3/9.
 */
public class Service {
   public void testMethod(Object lock){
       try{
           synchronized (lock){
               System.out.println("begin wait");
               lock.wait();
               System.out.println(" end wait()");
           }
       }catch (InterruptedException e){
           e.printStackTrace();
       }
   }
}

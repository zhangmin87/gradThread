package synLockIn_2;


/**
 * Created by zhangmin on 2017/1/20.
 */
public class Sub extends Main {
        synchronized public void operateSubMethod(){
               try{
                       while(i>0){
                               i--;
                               System.out.println("sub print i="+i);
                               Thread.sleep(100);
                               this.operateIMainMethod();
                       }

               }catch (InterruptedException e){
                        e.printStackTrace();
               }
        }
}

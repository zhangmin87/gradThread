package synMoreObjectStaticOneLock;

/**
 * Created by zhongdepeng on 2017/2/23.
 */
public class Service {
    synchronized public static void printA(){
        try{
            System.out.println("线程名称为"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
     }
    synchronized public static void printB(){
        System.out.println("线程名称为"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
    }
}

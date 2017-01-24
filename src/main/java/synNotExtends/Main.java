package synNotExtends;

/**
 * Created by zhangmin on 2017/1/22.
 */
public class Main {
    synchronized public void serviceMethod(){
        try{
            System.out.println("int main 下一步 sleep begin threadName="+Thread.currentThread().getName()+"time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("ini main 下一步sleep and threadName="+Thread.currentThread().getName()+"time="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

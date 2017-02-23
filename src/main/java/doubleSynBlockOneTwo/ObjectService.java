package doubleSynBlockOneTwo;

/**
 * Created by zhongdepeng on 2017/2/6.
 */
public class ObjectService {
    /**
     * 当一个线程访问object的一个
     * synchronized(this)同步代码块
     * 其他线程对同一个object中所有其他
     * synchronized(this)同步代码块的
     * 访问将堵塞，这说明synchronized使用
     * 的""对象监视器是一个
     */
    public void serviceMethodA(){
        try{
            synchronized (this){
                System.out.println("A begin time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end  end="+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time="+System.currentTimeMillis());
            System.out.println("B end end="+System.currentTimeMillis()  );
        }
    }

}

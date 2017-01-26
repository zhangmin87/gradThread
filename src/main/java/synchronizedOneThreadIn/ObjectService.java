package synchronizedOneThreadIn;

/**
 * Created by zhongdepeng on 2017/1/24.
 */
public class ObjectService {
    public void serviceMethod(){
    try{
        synchronized (this){
            System.out.println("begin time="+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("end end="+System.currentTimeMillis());
        }
    }catch(InterruptedException e){
        e.printStackTrace();
    }
    }

}

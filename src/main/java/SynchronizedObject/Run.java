package SynchronizedObject;

/**
 * Created by zhongdepeng on 2016/12/27.
 */
public class Run {
    public static void main(String[] args) {
        try{
        SynchronizedObject object=new SynchronizedObject();
        MyThread thread=new MyThread(object);
        thread.start();
        Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

package t11;

/**
 * Created by zhongdepeng on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){
        MyThread thread=new MyThread();
        thread.start();
        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace(); 
        }
    }
}

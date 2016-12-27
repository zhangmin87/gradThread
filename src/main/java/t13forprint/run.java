package t13forprint;



/**
 * Created by zhongdepeng on 2016/12/23.
 */
public class run {
    public static void main(String[] args){
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

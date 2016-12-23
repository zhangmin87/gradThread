package t12;

/**
 * Created by zhongdepeng on 2016/12/23.
 */
public class Run3 {
    public static void main(String[] args){
        MyThread thread=new MyThread();
        thread.start();
        try {
            thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？="+thread.isInterrupted());
            System.out.println("是否停止2？="+thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

package t16;

/**
 * Created by zhongdepeng on 2016/12/26.
 */
public class Mythread extends Thread {
    @Override
    public void run() {
        while(true){
            if(this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer:"+System.currentTimeMillis());
        }
    }
}

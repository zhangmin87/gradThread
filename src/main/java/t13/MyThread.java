package t13;

/**
 * Created by zhongdepeng on 2016/12/23.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<500000;i++){
            if(this.isInterrupted()){
                System.out.println("已经是停止状态了！我要退出");
                break;
            }
            System.out.println("i=="+(i+1));
        }
    }
}
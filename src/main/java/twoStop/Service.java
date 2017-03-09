package twoStop;

/**
 * Created by zhongdepeng on 2017/2/24.
 */
public class Service {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean isContinueRun=true;
        while(isContinueRun){
        }
        System.out.println("methodA end");
    }
    synchronized public void methodB(){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}

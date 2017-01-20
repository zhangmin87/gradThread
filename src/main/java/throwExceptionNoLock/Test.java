package throwExceptionNoLock;

import synLogkIn_1.*;

/**
 * Created by zhongdepeng on 2017/1/20.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Service service=new Service();
            ThreadA a=new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(5000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

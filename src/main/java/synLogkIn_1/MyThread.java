package synLogkIn_1;

import org.springframework.stereotype.*;

/**
 * Created by zhangmin on 2017/1/20.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service=new Service();
        service.service1();
    }
}

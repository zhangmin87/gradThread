package t15_1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by zhongdepeng on 2016/12/26.
 */
public class MyThread extends  Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
}


package t15;

import com.sun.org.apache.xpath.internal.SourceTree;
import t13_1.*;

/**
 * Created by zhongdepeng on 2016/12/26.
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}

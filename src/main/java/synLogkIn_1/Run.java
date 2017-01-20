package synLogkIn_1;

/**
 * Created by zhongdepeng on 2017/1/20.
 */

/**
 * 可重入锁的概念是:自己可以再次获取自己的内
 * 部锁，比如有一条线程获得了某个对象的错，此时这个
 * 对象锁还没有释放，当其再次想要获取这个对象的时候
 * 还是可以获取的，如果不可锁重入的话，会造成死锁
 * 可重入锁也支持在父类继承的环境中
 */
public class Run {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}

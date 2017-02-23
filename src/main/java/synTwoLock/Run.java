package synTwoLock;

/**
 * Created by zhongdepeng on 2017/2/22.
 * 从运行的效果上，并没有什么特别之处，都是同步的效果，和将
 * synchronized关键字加到非static方法上使用的效果是一样的，其实
 * 还是有本质上的不同，synchronized 关键字加到static 静态方法上
 * 是给class类上锁，到synchronzied 关键字加到非static 静态方法上
 * 是给对象上锁
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadC c=new ThreadC(service);
        c.setName("C");
        c.start();
    }
}

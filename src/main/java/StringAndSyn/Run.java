package StringAndSyn;

/**
 * Created by zhongdepeng on 2017/2/23.
 * 出现这样的情况是因为String 的两个值都是AA
 * 两个线程有相同的锁，所以造成线程B不能执行，
 * 这就是String 常量池所所带来的问题，因此在
 * 大多数的情况下，同步synchronized代码块都不用Sｔｒｉｎｇ
 * 作为锁对象，而改用其他，比如:new Object()实例化一个object
 * 对象，但他并不放入缓存中
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA threadA=new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB=new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}

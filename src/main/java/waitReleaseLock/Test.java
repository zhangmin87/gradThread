package waitReleaseLock;

/**
 * Created by zhongdepeng on 2017/3/9.
 * 当方法wait()被执行后,锁被自动释放了，但
 *执行完notify方法，锁却不自动释放
 */
public class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}

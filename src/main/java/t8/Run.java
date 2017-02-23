package t8;

/**
 * Created by zhongdepeng on 2017/2/17.
 * 在使用同步synchronized(this)代码块时需注意
 * 当一个线程访问object的一个synchronized(this)同步代码块
 * 其他线程对同一个object 中所有其他ysnhconized(（this）同步代码块的
 * 访问被堵塞，这说明synchronized使用的"对象监视器"是一个
 * 多个线程调用同一个对象中的不同名称的synchronized同步方法或synchronized(this)同一代码块
 * 时，调用的效果就是按照顺序执行，也就是同步，堵塞啦
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task=new Task();
        MyThread1 myThread1=new MyThread1(task);
        myThread1.start();
        Thread.sleep(100);
        MyThread2 myThread2=new MyThread2(task);
        myThread2.start();
    };
}

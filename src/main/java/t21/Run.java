package t21;

/**
 * Created by zhongdepeng on 2017/1/4.
 */
public class Run {
    /**
     *
     * 方法中变量都是私有化，所以不存在线程安全的问题，线程都是安全的
     * @param args
     */
    public static void main(String[] args) {
        HasSelfPrivateNum numRef=new HasSelfPrivateNum();
        ThreadA threadA=new ThreadA(numRef);
        threadA.start();
        ThreadB threadB=new ThreadB(numRef);
        threadB.start();
    }
}

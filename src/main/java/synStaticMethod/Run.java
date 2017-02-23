package synStaticMethod;

/**
 * Created by zhongdepeng on 2017/2/22.
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB();
        b.setName("B");
        b.start();
    }
}

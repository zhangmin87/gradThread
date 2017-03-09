package StringAndSyn2;

/**
 * Created by zhongdepeng on 2017/2/24.
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}

package synchronizedOneThreadIn;

/**
 * Created by zhongdepeng on 2017/1/25.
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service=new ObjectService();
        ThreadA a =new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("b");
        b.start();
    }
}

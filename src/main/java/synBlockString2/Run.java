package synBlockString2;

/**
 * Created by zhongdepeng on 2017/2/20.
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();

    }
}

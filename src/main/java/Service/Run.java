package Service;

/**
 * Created by zhongdepeng on 2017/2/20.
 * 下面再用另外一个项目来验证一下使用“synchronized(非this 对象x )同步代码块”格式
 * 有不同的对象监视器是异步的效果
 * 创建新的项目，名称为synBlockSttring2，验证synchronized(非this对象)与同步
 * synchronzied 方法是异步调用的效果
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
    }
}

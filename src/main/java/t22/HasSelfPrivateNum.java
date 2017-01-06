package t22;

/**
 * Created by zhongdepeng on 2017/1/4.
 */

/**
 * 如果是多线程共同访问1个对象中的实例变量
 * ，则有可能出现“非线程安全的问题”，
 * 用线程访问的对象中如果有多个实例变量
 * 则，运行的结果是可能出现交叉的情况，此情况
 * 在第一章中非线程安全的案例演示过
 */
public class HasSelfPrivateNum {
    private int num=0;
    public void addI(String username){
        try {
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num=200;
                System.out.println("b set over");
            }
            System.out.println(username+"num="+num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

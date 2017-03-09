package TwoThreadTransData;

/**
 * Created by zhongdepeng on 2017/2/24.
 * 虽然两个线程间实现了通信，但有一个弊端就是
 * 线程ThreadB.java不停地通过while语句咨询机制来检测
 * 一个条件，这样会浪费cpu资源
 * 如果轮询的时间间隔很少，更浪费cpu资源，如果轮询
 * 的时间间隔很大，有可能会取不到想得到的数据，所以就
 * 需要有一种机制来实现减少cpu的资源浪费，而且
 */
public class Test {
    public static void main(String[] args) {
        MyList myList=new MyList();
        ThreadB b=new ThreadB(myList);
        b.setName("B");
        b.start();
        ThreadA a=new ThreadA(myList);
        a.setName("A");
        a.start();;
    }
}

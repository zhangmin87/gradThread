package TwoThreadTransData;

/**
 * Created by zhangmin on 2017/2/24.
 */
public class ThreadB extends Thread {
    private MyList list;
    public  ThreadB(MyList list){
        super();
        this.list=list;
    }

    @Override
    public void run() {
        try{
            while(true){
                if(list.size()==5){
                    System.out.println("==5了，线程ｂ要退出了");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

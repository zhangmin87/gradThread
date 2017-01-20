package synLockIn_2;

/**
 * Created by zhongdepeng on 2017/1/20.
 */
public class Main {
    public int i=10;
    synchronized public void operateIMainMethod(){
        try{
            while(i>0){
                i--;
                System.out.println("main print i="+i);
                Thread.sleep(100);
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

package Service;

/**
 * Created by zhongdepeng on 2017/2/20.
 */
public class Service  {
    private String usernameParam;
    private String passwordParam;
    private String anyString;
    public void serUsernamePassword(String username ,String password){
        try{
            anyString=new String();
            synchronized (anyString){
                System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入同步快");
                usernameParam=username;
                Thread.sleep(3000);
                passwordParam=password;
            }
            System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开同步快");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

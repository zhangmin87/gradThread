package t8;



/**
 * Created by zhangmin  on 2017/2/17.
 */
public class MyThread1 extends Thread  {
    private Task task;
    public MyThread1(Task task){
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}


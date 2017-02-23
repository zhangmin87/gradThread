package t7;

/**
 * Created by zhongdepeng on 2017/2/6.
 */
public class MyThread1 extends Thread {
    private Task task;
    public MyThread1(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}

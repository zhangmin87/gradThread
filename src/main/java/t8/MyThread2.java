package t8;

/**
 * Created by zhongdepeng on 2017/2/17.
 */
public class MyThread2 extends Thread {
    private Task task;
    public MyThread2(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}

package TwoThreadTransData;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 2017/2/24.
 * 前面两章介绍了在java 语言中多线程的使用
 *
 */
public class MyList{
    private List list=new ArrayList();
    public void add(){
        list.add("高洪岩");
    }
    public int size(){
        return list.size();
    }
}

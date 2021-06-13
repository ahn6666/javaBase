package demo10throwable;

import java.util.Objects;

public class demo03Object {
    public static void main(String[] args) {
        methon(null);
    }

    private static void methon(Object o) {
        //源码
        if(o==null)
        {
            throw new NullPointerException("空指针");
        }
        /*Objects.requireNonNull(o);*/
        //重载的方法
       // Objects.requireNonNull(o,"传递的指针为空");

    }
}

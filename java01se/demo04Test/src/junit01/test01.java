package junit01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test01 {
    @Before
    public void before()
    {
        System.out.println("init........");
    }



    @After
    public void close()
    {
        System.out.println("在所有的方法执行后都是执行");
    }



    @Test
   public void add(){
//        System.out.println("nihao");
        junit01 add = new junit01();
        int result=add.add(1,3);//java.lang.ArithmeticException: / by zero
//        System.out.println(result);
    //一般会进行断言操作
        Assert.assertEquals(5,result);
        //Expected :3期望值
        //Actual   :4真实的值
        System.out.println("断言操作");
    }

}

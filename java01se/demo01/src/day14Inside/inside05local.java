package day14Inside;
/*局部：只有当前所属的方法才能使用它，出了这个方法外面就不能用了。
	定义格式：
	修饰符 class 外部类名称{
  修饰符 返回值类型 外部类名称（参数列表）
	{
	         class 局部内部类名称{//….}
         }
}*/
public class inside05local {

    public void inside()
    {
        class  local{//局部内部类
            int num=10;
            public void inner()
            {
                System.out.println(num);
            }

        }
        local obj=new local();
        obj.inner();
    }

}
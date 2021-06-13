package day07Inherit;
/*继承中成员方法的访问特点
在父子类的继承关系中，创建子类对象，访问成员方法的规则
	创建的对象是谁 就优先用谁 如果没有则向上找
注意事项：无论使成员方法还是成员变量 如果没有都是向上找父类 绝对不会向下找子类的*/
public class inherit04fu {
    public void methonfu()
    {
        System.out.println("这是一个父类");
    }
    public void methon()
    {
        System.out.println("这是fuqin自己独有的");
    }
}

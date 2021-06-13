package day07Inherit;
/*：在父子类的继承关系中，如果成员变量重名，则创建子类对象使，访问有两种方式：
直接通过子类对象访问成员变量名：
	等号左边使谁，就优先用谁，没有则向上找
间接通过成员方法访问成员变量：
该方法属于谁，就优先用谁，没有则向上找。*/
public class inherit02fu {
    int numfu=10;
    public void methonfu()
    {
        System.out.println("这是一个父类");
    }
}

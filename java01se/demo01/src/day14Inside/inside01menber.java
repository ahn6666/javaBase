package day14Inside;

public class inside01menber {
    int num=10;
    public class inside
    {
        int num=20;
        public void methonIns(){
            System.out.println(num);
        }

    }

    //	间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法
    //	直接方法：
    //		类名称 对象名=new 类名称（）；
    public void methon()
    {
        System.out.println("这是外部使用内部类");
        inside obj=new inside();
        obj.methonIns();
    }
    //【外部类名称.内部类 对象名=new 外部类（）.new 内部类名称（）；】


}

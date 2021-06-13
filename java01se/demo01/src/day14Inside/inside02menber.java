package day14Inside;
/*	如何使用成员内部类？有两种方式：
	间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法
	直接方法：
		类名称 对象名=new 类名称（）；
		【外部类名称.内部类 对象名=new 外部类（）.new 内部类名称（）；】
*/
public class inside02menber {
    public static void main(String[] args) {
        inside01menber stu=new inside01menber();
        stu.methon();
        System.out.println("=========");
        inside01menber.inside obj=new inside01menber().new inside();
        obj.methonIns();//20
    }
}

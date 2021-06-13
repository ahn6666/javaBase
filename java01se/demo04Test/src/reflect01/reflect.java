package reflect01;
/*	*获取class对象的方法：
	1:class.forName("全类名")：将字节码文件加载进内存中，返回class对象
		*多用于配置文件，将类名称定义在配置文件中，读取文件，加载类
	2:类名.class：通过类名的属性class获取
		*多用于参数的传递
	3：对象.getClass():getclass（）方法在object类中定义着
    *多用于对象的获取字节码的方法*/
public class reflect {
    public static void main(String[] args) throws Exception {
//        1:class.forName("全类名")：将字节码文件加载进内存中，返回class对象
//		*多用于配置文件，将类名称定义在配置文件中，读取文件，加载类

        Class pe = Class.forName("Reflect03.person");
        System.out.println(pe);
//        2:类名.class：通过类名的属性class获取
//		*多用于参数的传递
        Class<reflect01.person> pe2 = reflect01.person.class;
        System.out.println(pe2);
//        3：对象.getClass():getclass（）方法在object类中定义着
        reflect01.person p=new reflect01.person();
        Class pe3 = p.getClass();
        System.out.println(pe3);


        System.out.println(pe==pe2);//true

        System.out.println(pe3==pe2);//true
    }

}

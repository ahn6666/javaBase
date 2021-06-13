package demo01object;
//		看一个类是否重写了tostring方法 直接打印这个类对应对象的名字即可
//		如果一个类没有重写tostring方法 那么打印的就是这个对象的地址值
//		如果重写了tostring 方法 那么就按照重写的方式
public class demo01toString{
    public static void main(String[] args) {
        demo02person per =new demo02person("张丹",18);
        System.out.println(per);//object.demo02person@50cbc42f
        String s = per.toString();
        System.out.println(s);//object.demo02person@50cbc42f
        //由此可以看出 per=per.toString;
        //当创建了toString 之后
        //结果为//demo02person{name='张丹', num=18}
    }
}
